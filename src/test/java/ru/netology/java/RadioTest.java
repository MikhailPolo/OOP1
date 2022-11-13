package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNeverMinStation() {
        Radio radio = new Radio();
        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNeverMaxStation() {
        Radio radio = new Radio();
        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setStation() {
        Radio radio = new Radio();
        radio.setStation(3);

        int expected = 3;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStation() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setStation(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinStation() {
        Radio radio = new Radio();
        radio.setStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();
        radio.setVolume(3);

        int expected = 3;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio radio = new Radio();
        radio.setVolume(9);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNeverMinVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNeverMaxVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
