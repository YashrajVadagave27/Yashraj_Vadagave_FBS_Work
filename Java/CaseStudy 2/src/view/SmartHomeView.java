package view;

public class SmartHomeView {

    public static void menu() {
        System.out.println("""
====== SMART HOME MENU ======
1. Add Room
2. Add Device
3. Show All Rooms
4. Show Devices in a Room
5. ON Device
6. OFF Device
7. Show ON/OFF Time of device
8. Show Device Status (Detailed)
9. Exit
""");
    }
}
