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

    public int setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return maxStation;
        }
        if (currentStation < minStation) {
            return minStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }


    public int setNextStation(int nextStation) {
        int currentStation = this.getCurrentStation();
        if (nextStation > maxStation) {
            return minStation;
        }
        this.currentStation++;
        return currentStation++;
    }

    public int getNextStation() {

        return currentStation++;
    }

    public int prevStation(int prevStation) {
        int currentStation = this.getCurrentStation();
        if (prevStation < minStation) {
            return maxStation;
        }
        this.currentStation--;
        return prevStation;
    }

    public int getPrevStation() {

        return currentStation--;
    }

    public int inputNumberStation(int numberStation) {
        if (numberStation > maxStation) {
            return currentStation;
        }
        if (numberStation < minStation) {
            return currentStation;
        }
        this.currentStation = numberStation;
        return numberStation;
    }
    public int getInputNumberStation(int numberStation) {

        return numberStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxVolume() {

        return maxVolume;
    }
    public int getMinVolume() {

        return minVolume;
    }
    public int setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            return maxVolume;
        }
        if (currentVolume <= minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    public int upVolume(int currentVolume) {
        int upVolume = this.getCurrentVolume();
        if (currentVolume >= maxVolume) {
            return maxVolume;
        }
        this.currentVolume++;
        return upVolume(this.currentVolume++);
    }

    public int getUpVolume() {

        return currentVolume++;
    }

    public int downVolume(int currentVolume) {
        int downVolume = this.getCurrentVolume();
        if (currentVolume <= minVolume) {
            return minVolume;
        }
        this.currentVolume--;
        return downVolume(this.currentVolume--);
    }

    public int getDownVolume() {

        return currentVolume--;
    }
}


