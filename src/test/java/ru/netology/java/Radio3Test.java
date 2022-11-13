package ru.netology.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio3Test {

    @Test
    public void setNeverMinStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(-1);

        int expected = 0;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void setNeverMaxStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(10);

        int expected = 0;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(3);

        int expected = 3;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void nextStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(8);

        radio3.nextStation();

        int expected = 9;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMaxStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(9);

        radio3.nextStation();

        int expected = 0;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(1);

        radio3.prevStation();

        int expected = 0;
        int actual = radio3.getStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevMinStation() {
        Radio3 radio3 = new Radio3();
        radio3.setStation(0);

        radio3.prevStation();

        int expected = 9;
        int actual = radio3.getStation();
    }
    @Test
    public void setVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(3);

        int expected = 3;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(9);

        radio3.nextVolume();

        int expected = 10;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextMaxVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(10);

        radio3.nextVolume();

        int expected = 10;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(1);

        radio3.prevVolume();

        int expected = 0;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevMinVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(0);

        radio3.prevVolume();

        int expected = 0;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNeverMinVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(-1);

        int expected = 0;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNeverMaxVolume() {
        Radio3 radio3 = new Radio3();
        radio3.setVolume(11);

        int expected = 0;
        int actual = radio3.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
