package ru.netology.domain;

public class Radio {
    private String station;
    private int maxStation;
    private int minStation;
    private int currentStation;
    private String sound;
    private int minSound;
    private int maxSound;
    private int currentSound;
    private boolean on;

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getMinSound() {
        return minSound;
    }

    public void setMinSound(int minSound) {
        this.minSound = minSound;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxSound(int maxSound) {
        this.maxSound = maxSound;
    }

    public int getCurrentSound() {

        return currentSound;
    }

    public void decreaseCurrentSound() {
        if (currentSound == maxSound) {
            currentSound--;
            return;
        }
        setCurrentSound(currentSound - 1);
    }

    public void setCurrentSound(int currentSound) {
        if (currentSound >= maxSound) {
            currentSound = maxSound;
            return;
        }
        if (currentSound <= minSound) {
            currentSound = minSound;
            return;
        }
        this.currentSound = currentSound;


    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
