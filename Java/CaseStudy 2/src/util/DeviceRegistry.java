package util;

import java.util.*;
import model.RoomType;


public class DeviceRegistry {

    public static List<String> getDevices(RoomType type) {
        return switch (type) {
            case MASTER_ROOM, BEDROOM ->
                    List.of("AC", "Light", "Fan", "TV");
            case KITCHEN ->
                    List.of("Light", "Fan");
            case LIVING_ROOM ->
                    List.of("AC", "Light", "TV", "Fan");
            case BATHROOM ->
                    List.of("Light", "Geyser");
        };
    }
}

