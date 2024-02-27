package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {

    @Test
    void greets() {
        Cat c1 = new Cat("Murphy");
        assertDoesNotThrow(c1::greets);
    }

    @Test
    void testToString() {
        Cat c1 = new Cat("Murphy");
        assertEquals("Cat[Mammal[Animal[name= Murphy]]]", c1.toString());
    }
}