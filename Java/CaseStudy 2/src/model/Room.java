package model;

import java.io.Serializable;
import java.util.*;

public class Room implements Serializable {

    private String name;
    private RoomType type;
    private List<Device> devices = new ArrayList<>();

    public Room(String name, RoomType type) {
        this.name = name;
        this.type = type;
    }

    public void addDevice(Device d) {
        devices.add(d);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public String getName() {
        return name;
    }

    public RoomType getType() {
        return type;
    }
}
