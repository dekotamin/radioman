package ru.netology.radio;

public class Radio {
    int maxVolume = 10;
    int minVolume = 0;
    int maxStation = 9;
    int minStation = 0;
    int currentVolume;
    int currentStation;

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
        if (numberStation > maxStation) {
            numberStation = maxStation;
        }
        if (numberStation < minStation) {
            numberStation = minStation;
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
        return;
    }

    public void setUpVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume++;
        }
        this.currentVolume = maxVolume;
    }


    public void setDownVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}


