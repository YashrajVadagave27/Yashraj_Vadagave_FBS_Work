package model;

public class AC extends Device implements TemperatureControlDevice {

    private int temperature = 24;

    public AC() {
        super("AC");
    }

    public void setTemperature(int temp) {
        temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }
}
