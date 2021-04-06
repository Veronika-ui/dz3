package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void createRadio(){
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());

    }
    @Test
    public void createRadioVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setCurrentVolume(8);
        assertEquals(8, radio.getCurrentVolume());
    }
}
