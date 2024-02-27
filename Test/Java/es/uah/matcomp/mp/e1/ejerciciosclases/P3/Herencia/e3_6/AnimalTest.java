package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testToString() {
        Animal leon = new Animal("Arturo");
        assertEquals("Animal[name= Arturo]", leon.toString());
    }
}