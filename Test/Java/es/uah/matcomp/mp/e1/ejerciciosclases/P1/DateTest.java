package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(3, 5, 2024);
        int dia = date.getDay();
        assertEquals(dia, 3);
        assertTrue(dia > 0);
    }

    @Test
    void getMonth() {
        Date date = new Date(3, 5, 2024);
        int mes = date.getMonth();
        assertEquals(mes, 5);
        assertTrue(mes > 0);
    }

    @Test
    void getYear() {
        Date date = new Date(3, 5, 2024);
        int ano = date.getYear();
        assertEquals(ano, 2024);
        assertTrue(ano > 0);
    }

    @Test
    void setDay() {
        Date date = new Date(3, 5, 2024);
        date.setDay(20);
        assertEquals(date.getDay(), 20);
        assertDoesNotThrow(() -> date.setDay(20));
    }

    @Test
    void setMonth() {
        Date date = new Date(3, 5, 2024);
        date.setMonth(4);
        assertEquals(date.getMonth(), 4);
        assertTrue(date.getMonth() > 0);
        assertDoesNotThrow(() -> date.setMonth(7));
    }

    @Test
    void setYear() {
        Date date = new Date(3, 5, 2024);
        date.setYear(2020);
        assertEquals(date.getYear(), 2020);
        assertTrue(date.getYear() > 0);
        assertDoesNotThrow(() -> date.setYear(2020));
    }

    @Test
    void setDate() {
        Date date = new Date(3, 5, 2024);
        date.setDate(3, 3, 2003);
        assertEquals(date.getDay(), 3);
        assertEquals(date.getMonth(), 3);
        assertEquals(date.getYear(), 2003);
    }

    @Test
    void testToString() {
        Date date1 = new Date(3, 5, 2024);
        Date date2 =new Date(12,11,2023);
        assertEquals(date1.toString(), "03/05/2024");
        assertEquals(date2.toString(),"12/11/2023");
    }
}
