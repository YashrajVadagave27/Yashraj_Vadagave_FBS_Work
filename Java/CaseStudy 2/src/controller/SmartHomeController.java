package controller;

import java.util.*;

import model.*;
import util.DeviceRegistry;
import util.FileUtil;
import view.*;

public class SmartHomeController {

    private House house;
    private Scanner sc = new Scanner(System.in);

    public SmartHomeController() {
        house = (House) FileUtil.load();
        if (house == null) house = new House();
    }

    public void start() {
        while (true) {
            SmartHomeView.menu();
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> addRoom();
                case 2 -> addDevice();
                case 3 -> showRooms();
                case 4 -> showDevices();
                case 5 -> toggleDevice(true);
                case 6 -> toggleDevice(false);
                case 7 -> showTimeReport();
                case 8 -> showDetailedStatus();
                case 9 -> {
                    FileUtil.save(house);
                    System.out.println("Exit from program");
                    return;
                }
            }
        }
    }

    private void showDetailedStatus() {

        System.out.println("""
    ----------------------------------------------------------
    ROOM        DEVICE     STATUS     DETAILS
    ----------------------------------------------------------
    """);

        for (Room room : house.getRooms()) {
            for (Device d : room.getDevices()) {

                StringBuilder details = new StringBuilder();

                if (d instanceof TemperatureControlDevice t) {
                    details.append("Temp=").append(t.getTemperature()).append("°C ");
                }

                if (d instanceof LightingDevice l) {
                    details.append("Brightness=").append(l.getBrightness()).append("% ");
                }

                if (d instanceof EntertainmentDevice e) {
                    details.append("Ch=").append(e.getChannel())
                           .append(" Vol=").append(e.getVolume()).append(" ");
                }

                if (d instanceof WaterFlowDevice w) {
                    details.append("WaterTemp=").append(w.getWaterTemperature()).append("°C ");
                }

                if (details.length() == 0) {
                    details.append("No extra settings");
                }

                System.out.printf(
                        "%-12s %-10s %-8s %s%n",
                        room.getName(),
                        d.getName(),
                        d.getStatus(),
                        details.toString()
                );
            }
        }
    }


	private void addRoom() {
        RoomType[] types = RoomType.values();
        for (int i = 0; i < types.length; i++)
            System.out.println((i + 1) + ". " + types[i]);

        int c = sc.nextInt();
        RoomType type = types[c - 1];
        house.getRooms().add(new Room(type.name(), type));
        FileUtil.save(house);
        System.out.println(type + " added");
    }

    private void addDevice() {
        Room room = selectRoom();
        List<String> list = DeviceRegistry.getDevices(room.getType());

        for (int i = 0; i < list.size(); i++)
            System.out.println((i + 1) + ". " + list.get(i));

        Device d = createDevice(list.get(sc.nextInt() - 1));
        room.addDevice(d);
        FileUtil.save(house);
        System.out.println(d.getName() + " added to " + room.getName());
    }

    private void toggleDevice(boolean on) {
        Room room = selectRoom();
        List<Device> dlist = room.getDevices();

        for (int i = 0; i < dlist.size(); i++)
            System.out.println((i + 1) + ". " + dlist.get(i).getName());

        Device dev = dlist.get(sc.nextInt() - 1);

        if (on) {
            dev.turnOn();
            controlDeviceFeatures(dev);
        } else {
            dev.turnOff();
        }
    }

    private void controlDeviceFeatures(Device d) {

        if (d instanceof TemperatureControlDevice t) {
            System.out.print("Enter temperature: ");
            t.setTemperature(sc.nextInt());
        }

        if (d instanceof LightingDevice l) {
            System.out.print("Enter brightness (0-100): ");
            l.setBrightness(sc.nextInt());
        }

        if (d instanceof EntertainmentDevice e) {
            System.out.print("Enter channel: ");
            e.setChannel(sc.nextInt());
            System.out.print("Enter volume: ");
            e.setVolume(sc.nextInt());
        }

        if (d instanceof WaterFlowDevice w) {
            System.out.print("Enter water temperature: ");
            w.setWaterTemperature(sc.nextInt());
        }

        System.out.println("Device settings updated");
    }

    private void showRooms() {
        house.getRooms().forEach(r -> System.out.println(r.getName()));
    }

    private void showDevices() {
        System.out.println("Room\tDevice");
        for (Room r : house.getRooms())
            for (Device d : r.getDevices())
                System.out.println(r.getName() + "\t" + d.getName());
    }

    private void showTimeReport() {
        System.out.println("Room\tDevice\tStatus\tON\tOFF");
        for (Room r : house.getRooms())
            for (Device d : r.getDevices())
                System.out.println(
                        r.getName() + "\t" +
                        d.getName() + "\t" +
                        d.getStatus() + "\t" +
                        d.getOnTime() + "\t" +
                        d.getOffTime());
    }

    private Room selectRoom() {
        for (int i = 0; i < house.getRooms().size(); i++)
            System.out.println((i + 1) + ". " + house.getRooms().get(i).getName());
        return house.getRooms().get(sc.nextInt() - 1);
    }

    private Device createDevice(String name) {
        return switch (name) {
            case "AC" -> new AC();
            case "Light" -> new Light();
            case "Fan" -> new Fan();
            case "TV" -> new TV();
            case "Geyser" -> new Geyser();
            default -> null;
        };
    }
}
