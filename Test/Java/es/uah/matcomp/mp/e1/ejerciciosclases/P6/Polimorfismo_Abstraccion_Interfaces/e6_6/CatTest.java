package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat c1=new Cat("Mom");
        assertDoesNotThrow(c1::greets);
    }
}