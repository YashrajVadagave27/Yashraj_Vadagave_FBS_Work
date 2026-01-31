package model;

public class TV extends Device implements EntertainmentDevice {

    private int channel = 1;
    private int volume = 10;

    public TV() {
        super("TV");
    }

    public void setChannel(int ch) {
        channel = ch;
    }

    public int getChannel() {
        return channel;
    }

    public void setVolume(int vol) {
        volume = vol;
    }

    public int getVolume() {
        return volume;
    }
}
