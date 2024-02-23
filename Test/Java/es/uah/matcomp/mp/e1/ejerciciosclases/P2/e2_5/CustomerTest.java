package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c1 = new Customer(1,"Felipe", 'm');
        assertEquals(c1.getId(),1);
    }

    @Test
    void getName() {
        Customer c1 = new Customer(1,"Felipe", 'm');
        assertEquals(c1.getName(),"Felipe");
    }

    @Test
    void getGender() {
        Customer c1 = new Customer(1,"Felipe", 'm');
        assertEquals(c1.getGender(),'m');
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(1,"Felipe", 'm');
        assertEquals(c1.toString(),"Felipe(1)");
    }
}