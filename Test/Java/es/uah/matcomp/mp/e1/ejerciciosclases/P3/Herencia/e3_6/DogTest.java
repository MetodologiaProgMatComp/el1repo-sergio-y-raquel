package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {

    @Test
    void greets() {
        Dog d1 = new Dog("Nala");
        Dog d2 = new Dog("Lucas)");
        assertDoesNotThrow(() -> d1.greets(d2));
        assertDoesNotThrow(() -> d1.greets());
    }

    @Test
    void testGreets() {
        Dog d1 = new Dog("Nala");
        assertDoesNotThrow(() -> d1.greets());
    }

    @Test
    void testToString() {
        Dog d1 = new Dog("Nala");
        assertEquals("Dog[Mammal[Animal[name= Nala]]]", d1.toString());
    }
}