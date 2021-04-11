package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void setcurrentStation() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.setcurrentStation(1);
        assertEquals(1, energy.getcurrentStation());
    }

    @Test
    void setNumberStationMax() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.setcurrentStation(10);
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void setNumberStationOverMin() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.setcurrentStation(-1);
        assertEquals(-1, energy.getcurrentStation());
    }

    @Test
    void nextNormalJob() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.next();
        assertEquals(1, energy.getcurrentStation());
    }

    @Test
    void nextLoop() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.setcurrentStation(9);
        energy.next();
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void prevNormalJob() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.setcurrentStation(9);
        energy.prev();
        assertEquals(8, energy.getcurrentStation());
    }

    @Test
    void plusNormalJob() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.plusSound();
        assertEquals(0, energy.getcurrentStation());
    }

    @Test
    void prevLoop() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.prev();
        assertEquals(9, energy.getcurrentStation());
    }

    @Test
    void crossingPlusBorder() {
        ru.netology.Radio energy = new ru.netology.Radio();

        for (int i = 0; i < 11; i++) {
            energy.plusSound();
        }
        assertEquals(10, energy.getcurrentSound());
    }

    @Test
    void minusNormalJob() {
        ru.netology.Radio energy = new ru.netology.Radio();

        energy.plusSound();
        energy.minusSound();
        assertEquals(0, energy.getcurrentSound());
    }

    @Test
    void crossingMinusBorder() {
        ru.netology.Radio energy = new Radio();

        energy.minusSound();
        assertEquals(0, energy.getcurrentSound());
    }
}

