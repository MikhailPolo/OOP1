package ru.netology.java;

public class Radio {
    private int station;
    private int volume;
    private int maxStation;

    public Radio() {
        maxStation = 9;

    }

    public Radio(int stationsTotal) {
        maxStation = stationsTotal - 1;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        station = newStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void nextStation() {
        if (station < maxStation) {
            station = station + 1;
            return;
        }
        station = 0;
    }

    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else {
            station = maxStation;
        }
    }

    public void nextVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void prevVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
