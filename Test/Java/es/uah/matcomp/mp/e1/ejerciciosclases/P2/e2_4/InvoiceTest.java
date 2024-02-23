package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getId(), 3);
    }

    @Test
    void getCustomer() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getCustomer(), c1);
    }

    @Test
    void setCustomer() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        Customer c2 = new Customer(2,"Antonio",50);
        i1.setCustomer(c2);
        assertEquals(i1.getCustomer(), c2);
    }

    @Test
    void getAmount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getAmount(), 20.50);
    }

    @Test
    void setAmount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        i1.setAmount(10.85);
        assertEquals(i1.getAmount(), 10.85);
    }

    @Test
    void getCustomerId() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getCustomerId(), 1);
    }

    @Test
    void getCustomerName() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getCustomerName(), "Felipe");
    }

    @Test
    void getCustomerDiscount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.getCustomerDiscount(), 20);
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        double afterDiscount = i1.getAmountAfterDiscount();
        assertEquals(afterDiscount, 16.40);
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(1, "Felipe", 20);
        Invoice i1 = new Invoice(3, c1, 20.50);
        assertEquals(i1.toString(), "Invoice[id=3, customer=Felipe(1)(20%), amount=20.5]");
    }
}