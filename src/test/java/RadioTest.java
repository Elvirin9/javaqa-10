import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void turnMiddleStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turnMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turnMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void turnStationBelowAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnStationAboveAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setVolumeBelowAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setVolumeAboveAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeAboveAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void increaseVolumeBelowAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reducingMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reducingVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reducingMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reducingVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reducingMiddleVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reducingVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reducingVolumeAboveAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.reducingVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void reducingVolumeBelowAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reducingVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void turnNextStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnNextStationAbove() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnNextStationBelow() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnPrevStationMiddle() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnPrevStationAbove() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void turnPrevStationBelow() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void test() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(15);
        assertEquals(15, radio.getCurrentStation());
    }


}
