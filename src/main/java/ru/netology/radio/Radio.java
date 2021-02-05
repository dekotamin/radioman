package ru.netology.radio;

public class Radio {
    private final int maxVolume = 10;
    private final int minVolume = 0;
    private final int maxStation = 9;
    private final int minStation = 0;
    private int currentVolume;
    private int currentStation;

    public int getCurrentStation() {

        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
            if (currentStation == maxStation) {
                return maxStation;
            }
            if (currentStation == minStation) {
                return minStation;
            }
            this.currentStation = currentStation;
            return currentStation;
    }

    public int setNextStation(int nextStation) {
        int currentStation = this.getCurrentStation();
        if (nextStation == maxStation) {
            return minStation;
        }
        this.currentStation++;
        return currentStation++;
    }

    public int getNextStation() {

        return currentStation++;
    }

    public int setPrevStation(int currentStation) {
        int prevStation = this.currentStation;
        if (prevStation == minStation) {
            return maxStation;
        }
        this.currentStation--;
        return currentStation--;
    }

    public int getPrevStation() {

        return currentStation--;
    }

    public int inputNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            return currentStation;
        }
        this.currentStation = numberStation;
        return numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume == maxVolume) {
            return maxVolume;
        }
        if (currentVolume <= minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    public int setUpVolume(int currentVolume) {
        int upVolume = this.getCurrentVolume();
        if (currentVolume == maxVolume) {
            return maxVolume;
        }
        this.currentVolume++;
        return currentVolume++;
    }

    public int getUpVolume() {

        return this.currentVolume++;
    }

    public int setDownVolume(int currentVolume) {
        int downVolume = this.getCurrentVolume();
        this.currentVolume--;
        return currentVolume--;
    }

    public int getDownVolume() {

        return this.currentVolume--;
    }

    public int getInputNumberStation(int numberStation) {
        return numberStation;
    }
}