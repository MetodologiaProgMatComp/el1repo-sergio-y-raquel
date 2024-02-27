package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalTest {

    @Test
    void testToString() {
        Mammal m1 = new Mammal("Juan");
        assertEquals("Mammal[Animal[name= Juan]]", m1.toString());
    }
}