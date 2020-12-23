package ru.netology;

public class Radio {
    private String name;
    private int currentStation;
    private int nextStation;
    private int prevStation;
    private int volumeSound;
    private int maxVolumeSound;
    private int minVolumeSound;
    private boolean on;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public int getNextStation() {
        return nextStation;
    }

    public int getPrevStation() {
        return prevStation;
    }

    public int getMaxVolumeSound() {
        return maxVolumeSound;
    }

    public int getMinVolumeSound() {
        return minVolumeSound;
    }

    public void getVolumeSound(int volumeSound) {
        this.volumeSound = volumeSound;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public int getVolumeSound() {
        return volumeSound;
    }

    public void setPrevStation(int prevStation) {
        this.prevStation = prevStation;
    }

    public void setNextStation(int nextStation) {
        this.nextStation = nextStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setMaxVolumeSound(int maxVolumeSound) {
        this.maxVolumeSound = maxVolumeSound;
    }

    public void setMinVolumeSound(int minVolumeSound) {
        this.minVolumeSound = minVolumeSound;
    }
}