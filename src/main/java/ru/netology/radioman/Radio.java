package ru.netology.domain;

public class Radio {
    private int maxVolume = 10;
    private int minVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int currentVolume;
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return maxStation;
        }
        if (currentStation < minStation) {
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }


    public void nextStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation++;
    }

    public void prevStation() {
        int currentStation = this.getCurrentStation();
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation--;
    }

    public void inputNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            return;
        }
        if (numberStation < minStation) {
            return;
        }
        this.currentStation = numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void downVolume() {
        int currentVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }

}



