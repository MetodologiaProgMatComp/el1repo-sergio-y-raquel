package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void getHour() {
        Time time=new Time(3,3,3);
        int hora=time.getHour();
        assertEquals(hora,3);
        assertTrue(hora > 0);
    }

    @Test
    void getMinute() {
        Time time=new Time(3,5,3);
        int minuto=time.getMinute();
        assertEquals(minuto,5);
        assertTrue(minuto > 0);
    }

    @Test
    void getSecond() {
        Time time=new Time(3,5,30);
        int sec=time.getSecond();
        assertEquals(sec,30);
        assertTrue(sec > 0);
    }

    @Test
    void setHour() {
        Time time=new Time(3,5,30);
        time.setHour(13);
        int hora=time.getHour();
        assertEquals(hora,13);
        assertDoesNotThrow(()-> time.setHour(13));
    }

    @Test
    void setMinute() {
        Time time=new Time(3,5,30);
        time.setMinute(20);
        int min=time.getMinute();
        assertEquals(min,20);
        assertDoesNotThrow(()-> time.setMinute(13));
    }

    @Test
    void setSecond() {
        Time time=new Time(3,5,30);
        time.setSecond(53);
        int sec=time.getSecond();
        assertEquals(sec,53);
        assertDoesNotThrow(()-> time.setSecond(53));
    }

    @Test
    void setTime() {
        Time time=new Time(3,5,30);
        time.setTime(14,30,23);
    }

    @Test
    void testToString() {
    }

    @Test
    void nextSecond() {
    }

    @Test
    void previousSecond() {
    }
}