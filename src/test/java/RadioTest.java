import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void getCurrentStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void getNextStation() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getNextStation());
    }

    @Test
    public void getPrevStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getPrevStation());
    }

    @Test
    public void getCurrentStationThrowMaxStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void getNextStationThrowMaxStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getNextStation());
    }

    @Test
    public void getCurrentStationThrowMinStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void getPrevStationThrowMinStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getPrevStation());
    }
    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void getUpVolume() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getUpVolume());
    }

    @Test
    public void getCurrentVolumeThrowDown() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void getDownVolume() {
        Radio radio = new Radio();
        int expected = 7;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void getCurrentVolumeThrowMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void getDownVolumeThrowMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getDownVolume());
    }

    @Test
    public void getCurrentVolumeThrowMaxVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void getUpVolumeThrowMaxVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getUpVolume());
    }

    @Test
    public void getMaxVolume() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test
    public void getMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getMinVolume());
    }

    @Test
    public void getInputNumberStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.getInputNumberStation(expected);
        assertEquals(expected, radio.getInputNumberStation(9));
    }
    @Test
    public void getInputNumberStationThrowMaxStation() {
        Radio radio = new Radio();
        int expected = 15;
        radio.getInputNumberStation(expected);
        assertEquals(expected, radio.getInputNumberStation(15));
    }
}