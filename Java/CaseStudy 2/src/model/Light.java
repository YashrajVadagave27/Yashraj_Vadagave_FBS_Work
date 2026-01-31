package model;

public class Light extends Device implements LightingDevice {

    private int brightness = 50;

    public Light() {
        super("Light");
    }

    public void setBrightness(int level) {
        brightness = level;
    }

    public int getBrightness() {
        return brightness;
    }
}
