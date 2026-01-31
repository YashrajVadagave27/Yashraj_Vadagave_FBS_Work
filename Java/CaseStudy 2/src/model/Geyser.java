package model;

public class Geyser extends Device implements WaterFlowDevice {

    private int waterTemp = 40;

    public Geyser() {
        super("Geyser");
    }

    public void setWaterTemperature(int t) {
        waterTemp = t;
    }

    public int getWaterTemperature() {
        return waterTemp;
    }
}
