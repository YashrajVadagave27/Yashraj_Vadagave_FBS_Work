package model;

import java.io.Serializable;
import java.util.*;

public class House implements Serializable {
    private List<Room> rooms = new ArrayList<>();
    public List<Room> getRooms() { return rooms; }
}
