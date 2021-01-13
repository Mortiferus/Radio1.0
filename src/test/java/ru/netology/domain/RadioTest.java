package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    
    @Test
    public void increaseVolume() {

        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolume() {

        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(7);
        radio.decreaseVolume();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void decreaseVolumeMin() {

        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeMax() {

        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void nextRadioStation() {

        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.nextRadioStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {

        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(5);
        radio.prevRadioStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationMax() {

        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStationMin() {

        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentStationOver() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(13);
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentStationUnder() {
        Radio radio = new Radio();
        radio.setMaxRadioStation(9);;
        radio.setMinRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentVolumeOver() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(11);
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeUnder() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
}
