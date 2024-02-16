package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getID() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertEquals("1", i.getID());
    }

    @Test
    void getDesc() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertEquals("Desc", i.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertEquals(20, i.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertDoesNotThrow(() -> i.setQty(10));
        int q = i.getQty();
        assertEquals(10, q);
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertEquals(1, i.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 1);
        assertDoesNotThrow(() -> i.setUnitPrice(2));
        double u = i.getUnitPrice();
        assertEquals(2, u);
    }

    @Test
    void getTotal() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 2);
        double t = i.getTotal();
        assertEquals(40, t);
    }

    @Test
    void testToString() {
        InvoiceItem i = new InvoiceItem("1", "Desc", 20, 2);
        assertEquals("InvoiceItem{ID= 1, desc= Desc, qty= 20, unitPrice= 2.0}",i.toString());
    }
}