package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a= new Account("1","Felipe",20000);
        assertEquals("1", a.getId());
    }

    @Test
    void getName() {
        Account a= new Account("1","Felipe",20000);
        assertEquals("Felipe", a.getName());
    }

    @Test
    void getBalance() {
        Account a= new Account("1","Felipe",20000);
        assertEquals(20000, a.getBalance());
    }

    @Test
    void setBalance() {
        Account a= new Account("1","Felipe",20000);
        assertDoesNotThrow(() -> a.setBalance(100000));
        int bal = a.getBalance();
        assertEquals(100000, bal);
    }

    @Test
    void credit() {
        Account a= new Account("1","Felipe",20000);
        int bal = a.credit(50);
        assertEquals(20050, bal);
    }

    @Test
    void debit() {
        Account a= new Account("1","Felipe",20050);
        int bal = a.debit(50);
        assertEquals(20000, bal);
        Account b= new Account("1","Felipe",20000);
        assertEquals(20000, b.debit(20050));
    }

    @Test
    void transferTo() {
        Account a= new Account("1","Felipe",20050);
        Account b= new Account("1","Felipe",20000);
        int bal1 = a.transferTo(b, 50);
        int bal2 = b.getBalance();
        assertEquals(20050, bal2);
        assertEquals(20000, bal1);
        assertTrue(bal2>bal1);

        Account c=new Account("2","Felipe");
        int bal3=a.transferTo(b,50);
        assertEquals(bal2,20050);

    }

    @Test
    void testToString() {
        Account a= new Account("1","Felipe",20000);
        assertEquals("Account{Id= 1, name= Felipe, balance=20000}",a.toString());
    }
}