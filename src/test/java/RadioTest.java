
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void currentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation(8);
        assertEquals(9, radio.getNextStation());
        radio.getNextStation();
    }

    @Test
    public void stationInBack() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setPrevStation(8);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void prevStationThrowMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation(0);
        assertEquals(0, radio.getPrevStation());
    }

    @Test
    public void nextStationThrowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation(9);
        assertEquals(0, radio.getNextStation());
    }

    @Test
    public void currentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void upVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setUpVolume(9);
        assertEquals(10, radio.getUpVolume());
    }

    @Test
    public void upVolumeThrowMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setUpVolume(10);
        assertEquals(0, radio.getUpVolume());
    }

    @Test
    public void downVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setDownVolume(9);
        assertEquals(8, radio.getDownVolume());
    }

    @Test
    public void downVolumeThrowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getDownVolume());
        radio.getDownVolume();
    }

    @Test
    public void inputNumberStation() {
        Radio radio = new Radio();
        radio.inputNumberStation(15);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void getInputNumberStation() {
        Radio radio = new Radio();
        radio.inputNumberStation(5);
        radio.getInputNumberStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void getInputNumberStationThrowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.getInputNumberStation(11);
        assertEquals(5, radio.getCurrentStation());
    }
}