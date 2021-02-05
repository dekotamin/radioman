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

    public int setNextStation(int currentStation) {
        if (currentStation == maxStation) {
            return minStation;
        } else
            this.currentStation++;
        return this.currentStation;
    }

    public int getNextStation() {

        return currentStation++;
    }

    public int setPrevStation(int currentStation) {
        if (currentStation == maxStation) {
            return minStation;
        } else
            this.currentStation--;
        return this.currentStation;
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
        int minVolume = 0;
        if (currentVolume <= minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    public int setUpVolume(int currentVolume) {
        int upVolume = this.getUpVolume();
        if (currentVolume < maxVolume) {
            return upVolume;
        }
        this.currentVolume = maxVolume;
        return maxVolume;
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