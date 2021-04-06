package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setcurrentStation() {
        Radio energy = new Radio();

        energy.setcurrentStation(1);
        assertEquals(1, energy.getcurrentStation());
    }

    @Test
    void setNumberStationMax() {
        Radio energy = new Radio();

        energy.setcurrentStation(10);
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void setNumberStationOverMin() {
        Radio energy = new Radio();

        energy.setcurrentStation(-1);
        assertEquals(-1, energy.getcurrentStation());
    }

    @Test
    void nextNormalJob() {
        Radio energy = new Radio();

        energy.next();
        assertEquals(1, energy.getcurrentStation());
    }

    @Test
    void nextLoop() {
        Radio energy = new Radio();

        energy.setcurrentStation(9);
        energy.next();
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void prevNormalJob() {
        Radio energy = new Radio();

        energy.setcurrentStation(9);
        energy.prev();
        assertEquals(8, energy.getcurrentStation());
    }

    @Test
    void plusNormalJob() {
        Radio energy = new Radio();

        energy.plusSound();
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void prevLoop() {
        Radio energy = new Radio();

        energy.prev();
        assertEquals(9, energy.getcurrentStation());
    }

    @Test
    void crossingPlusBorder() {
        Radio energy = new Radio();

        for (int i = 0; i < 11; i++) {
            energy.plusSound();
        }
        assertEquals(10, energy.getcurrentSound());
    }

    @Test
    void minusNormalJob() {
        Radio energy = new Radio();

        energy.plusSound();
        energy.minusSound();
        assertEquals(0, energy.getcurrentSound());
    }

    @Test
    void crossingMinusBorder() {
        Radio energy = new Radio();

        energy.minusSound();
        assertEquals(0, energy.getcurrentSound());
    }
}

