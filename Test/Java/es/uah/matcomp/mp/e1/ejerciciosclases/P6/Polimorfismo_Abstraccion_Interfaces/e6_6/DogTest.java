package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog d1=new Dog("Adolfo");
        assertDoesNotThrow(()->d1.greets());
        assertDoesNotThrow(()->d1.greets(new Dog("Charly")));
    }
}