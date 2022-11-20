package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestConstructor {

    @Test
    public void testSetStation() {
        Radio radio = new Radio(30);

        radio.setStation(15);

        int expected = 15;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio radio = new Radio(15);

        radio.setStation(12);
        radio.nextStation();

        int expected = 13;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio(15);

        radio.setStation(12);
        radio.prevStation();

        int expected = 11;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextMaxStation() {
        Radio radio = new Radio(15);

        radio.setStation(14);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevMinStation() {
        Radio radio = new Radio(15);

        radio.setStation(0);
        radio.prevStation();

        int expected = 14;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }
}
