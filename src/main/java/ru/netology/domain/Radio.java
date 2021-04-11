package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int minSound = 0;
    private int maxSound = 10;
    private int currentSound;
    private boolean on;

    public int currentStation() {
        return currentStation;
    }
    public int getcurrentStation() {
        return currentStation;
    }

    public void setcurrentStation(int numberStation) {
        if (currentStation >= minStation && numberStation <= maxStation)
            this.currentStation = numberStation;
    }

    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getcurrentSound() {
        return currentSound;
    }

    public void plusSound() {
        if (currentSound == maxSound) return;
        currentSound++;
    }

    public void minusSound() {
        if (currentSound == minSound) return;
        currentSound--;
    }
    }
