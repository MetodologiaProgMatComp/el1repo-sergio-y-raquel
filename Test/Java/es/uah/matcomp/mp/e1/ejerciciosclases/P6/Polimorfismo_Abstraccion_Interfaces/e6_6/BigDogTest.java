package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog bd1=new BigDog("Adolfo");
        BigDog bd2=new BigDog("Nala");
        Dog d1=new Dog("Charly");
        assertDoesNotThrow(()->bd1.greets());
        assertDoesNotThrow(()->bd1.greets(d1));
        assertDoesNotThrow(()->bd1.greets(bd2));
    }
}