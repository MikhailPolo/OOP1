package ru.netology.java;

public class Radio3 {
    private int station;
    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }

    public void nextStation() {
        if (station < 9) {
            station = station + 1;
            return;
        } station = 0;
    }

    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else station = 9;
    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }
    public void nextVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }
    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
