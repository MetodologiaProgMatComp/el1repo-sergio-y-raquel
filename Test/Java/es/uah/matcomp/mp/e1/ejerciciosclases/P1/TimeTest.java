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
        assertEquals(time.getHour(),14);
        assertEquals(time.getSecond(),23);
        assertEquals(time.getMinute(),30);
    }

    @Test
    void testToString() {
        Time time1=new Time(3,5,5);
        Time time2=new Time(10,10,10);
        assertEquals("03:05:05",time1.toString());
        assertEquals("10:10:10",time2.toString());
    }

    @Test
    void nextSecond() {
        Time time1=new Time(3,5,5);
        Time sumaSegundo=time1.nextSecond();
        Time time2=new Time(3,5,6);
        assertEquals(time2.toString(),sumaSegundo.toString());

        Time time3=new Time(23,59,59);
        Time time4=new Time(0,0,0);
        assertEquals(time4.toString(),time3.nextSecond().toString());
    }

    @Test
    void previousSecond() {
        Time time1=new Time(3,5,5);
        Time sumaSegundo=time1.previousSecond();
        Time time2=new Time(3,5,4);
        assertEquals(time2.toString(),sumaSegundo.toString());

        Time time4=new Time(0,0,0);
        Time time3=new Time(23,59,59);
        assertEquals(time3.toString(),time4.previousSecond().toString());
    }
}