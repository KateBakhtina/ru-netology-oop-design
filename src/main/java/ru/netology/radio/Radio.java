// Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций не включительно. То есть если станций 10, то номер последней — 9.

package ru.netology.radio;

public class Radio {

    private int countOfStations = 9; // 10 - 1
    private int maxVolume = 100;
    private int minVolume;
    private int currentStation;
    private int currentVolume;



    public Radio(int newCountOfStations) {
        this.countOfStations = newCountOfStations - 1;

    }

    public Radio(){
    }

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= countOfStations) {
            currentStation = newStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void next() {
        if (currentStation == countOfStations) {
            currentStation = 0;
        } else {
            currentStation ++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = countOfStations;
        } else {
            currentStation --;
        }
     }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= minVolume && newVolume <= maxVolume) {
            currentVolume = newVolume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int turnUpVolume() {
        if (currentVolume < maxVolume) {
            currentVolume ++;
        }
        return currentVolume;
    }

    public void turnDownVolume() {
        if (currentVolume > minVolume) {
            currentVolume --;
        }
    }
}
