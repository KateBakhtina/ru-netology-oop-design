package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForCurrentStationWithoutParametersTest.csv")
    public void currentStationWithoutParametersTest(int newStation, int expectedStation) {
        Radio station = new Radio();

        station.setCurrentStation(newStation);
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(actualStation, expectedStation);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForCurrentStationWithParametersTest.csv")
    public void currentStationWithParametersTest(int newStation, int expectedStation) {
        Radio station = new Radio(13);

        station.setCurrentStation(newStation);
        int actualStation = station.getCurrentStation();

        Assertions.assertEquals(actualStation, expectedStation);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForNextTest.csv")
    public void nextTest(int newStation, int expected) {
        Radio station = new Radio();

        station.setCurrentStation(newStation);
        station.next();
        int actual = station.getCurrentStation();

        Assertions.assertEquals(actual, expected);
    };

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForPrevTest.csv")
    public void prevTest(int newStation, int expected) {
        Radio station = new Radio();

        station.setCurrentStation(newStation);
        station.prev();
        int actual = station.getCurrentStation();

        Assertions.assertEquals(actual, expected);
    };

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForCurrentVolumeTest.csv")
    public void currentVolumeTest(int newVolume, int expected) {
        Radio station = new Radio();

        station.setCurrentVolume(newVolume);
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    };

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForTurnUpVolumeTest.csv")
    public void turnUpVolumeTest(int newVolume, int expected) {
        Radio station = new Radio();

        station.setCurrentVolume(newVolume);
        station.turnUpVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    };

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataForTurnDownVolumeTest.csv")
    public void turnDownVolumeTest(int newVolume, int expected) {
        Radio station = new Radio();

        station.setCurrentVolume(newVolume);
        station.turnDownVolume();
        int actual = station.getCurrentVolume();

        Assertions.assertEquals(actual, expected);
    }
}
