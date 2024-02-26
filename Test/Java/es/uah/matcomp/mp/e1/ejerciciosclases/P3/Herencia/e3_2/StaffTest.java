package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {

    @Test
    void getSchool() {
        Staff s1 = new Staff("Juan", "Calle pio", "Espartales", 500.0);
        assertEquals("Espartales", s1.getSchool());
    }

    @Test
    void setSchool() {
        Staff s1 = new Staff("Juan", "Calle pio", "Espartales", 500.0);
        s1.setSchool("Hemingway");
        assertEquals("Hemingway", s1.getSchool());
    }

    @Test
    void getPay() {
        Staff s1 = new Staff("Juan", "Calle pio", "Espartales", 500.0);
        assertEquals(500.0, s1.getPay());
    }

    @Test
    void setPay() {
        Staff s1 = new Staff("Juan", "Calle pio", "Espartales", 500.0);
        s1.setPay(600.0);
        assertEquals(600.0, s1.getPay());
    }

    @Test
    void testToString() {
        Staff s1 = new Staff("Juan", "Calle pio", "Espartales", 500.0);
        assertEquals("Staff[Person[name= Juan, address= Calle pio], school= Espartales, pay= 500.0]", s1.toString());
    }
}