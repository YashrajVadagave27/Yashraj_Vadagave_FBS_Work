package model;

import java.io.Serializable;

public class Device implements Controllable, TimeTrackable, Serializable {

    protected String name;
    protected boolean isOn;
    protected long lastChange;
    protected long onTime;
    protected long offTime;

    public Device(String name) {
        this.name = name;
        lastChange = System.currentTimeMillis();
    }

    public void turnOn() {
        if (!isOn) {
            offTime += System.currentTimeMillis() - lastChange;
            isOn = true;
            lastChange = System.currentTimeMillis();
        }
    }

    public void turnOff() {
        if (isOn) {
            onTime += System.currentTimeMillis() - lastChange;
            isOn = false;
            lastChange = System.currentTimeMillis();
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public String getStatus() {
        return isOn ? "ON" : "OFF";
    }

    public long getOnTime() {
        return onTime / 1000;
    }

    public long getOffTime() {
        return offTime / 1000;
    }

    public String getName() {
        return name;
    }
}

