package ru.netology.radio;

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

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void setPrevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void inputNumberStation(int numberStation) {
        if (numberStation >= maxStation) {
            numberStation = maxStation;
        }
        if (numberStation <= minStation) {
            numberStation = minStation;
        }
        this.currentStation = numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
        return;
    }

    public void setUpVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        currentVolume++;
    }


    public void setDownVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}


