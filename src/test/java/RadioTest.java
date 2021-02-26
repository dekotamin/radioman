
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    void currentStation() {
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void nextStation() {
        radio.setCurrentStation(8);
        radio.setNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void stationInBack() {
        radio.setCurrentStation(8);
        radio.setPrevStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void prevStationThrowMaxStation() {
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void ShouldMinStation() {
        radio.setCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void nextStationThrowMinStation() {
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void ShouldMaxStation() {
        radio.setCurrentStation(12);
        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    void currentVolume() {
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void upVolume() {
        radio.setCurrentVolume(9);
        radio.setUpVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void upVolumeShouldMaxVolume() {
        radio.setCurrentVolume(10);
        radio.setUpVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void upVolumeThrowMaxVolume() {
        radio.setCurrentVolume(11);
        radio.setUpVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void downVolume() {
        radio.setCurrentVolume(1);
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void downVolumeThrowMin() {
        radio.setCurrentVolume(-1);
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void inputNumberStation() {
        radio.inputNumberStation(15);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void getInputNumberStation() {
        radio.inputNumberStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void getInputNumberStationThrowMin() {
        radio.inputNumberStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
}