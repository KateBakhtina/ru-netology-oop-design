// made changes from flexible

package ru.netology.radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            currentStation = newStation;
        }
    };

    public int getCurrentStation() {
        return currentStation;
    };

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation ++;
        }
    };

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation --;
        }
     };

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = newVolume;
        }
    };

    public int getCurrentVolume() {
        return currentVolume;
    };

    public int turnUpVolume() {
        if (currentVolume < 100) {
            currentVolume ++;
        }
        return currentVolume;
    };

    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume --;
        }
    };
}
