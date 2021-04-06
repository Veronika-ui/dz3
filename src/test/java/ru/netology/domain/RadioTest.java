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
    public void createRadioSound() {
        Radio radio = new Radio();
        radio.setMaxSound(10);
        radio.setCurrentSound(8);
        assertEquals(8, radio.getCurrentSound());
    }

    @Test

}
