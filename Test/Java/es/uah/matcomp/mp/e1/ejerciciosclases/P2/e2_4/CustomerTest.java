package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_4;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_4.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c1 = new Customer(1, "Felipe", 20);
        assertEquals(c1.getName(), "Felipe");
    }

    @Test
    void getName() {
        Customer c1 = new Customer(1, "Felipe", 20);
        assertEquals(c1.getId(), 1);
    }

    @Test
    void getDiscount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        assertEquals(c1.getDiscount(), 20);
    }

    @Test
    void setDiscount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        c1.setDiscount(25);
        assertEquals(c1.getDiscount(), 25);
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(1, "Felipe", 20);
        assertEquals(c1.toString(), "Felipe(1)(20%)");

    }
}