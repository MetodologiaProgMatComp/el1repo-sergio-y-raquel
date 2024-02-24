package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_5;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_5.Account;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_5.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        assertEquals(3, a1.getId());
    }

    @Test
    void getCustomer() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        assertEquals(c1, a1.getCustomer());
    }

    @Test
    void getBalance() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        assertEquals(20.5, a1.getBalance());
    }

    @Test
    void setBalance() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        a1.setBalance(10.45);
        assertEquals(10.45, a1.getBalance());
    }

    @Test
    void testToString() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        assertEquals("id=3 Customer=Felipe(1) balance=$20,50", a1.toString());
    }

    @Test
    void getCustomerName() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1);
        assertEquals("Felipe", a1.getCustomerName());
    }

    @Test
    void deposit() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        a1.deposit(10);
        assertEquals(30.5, a1.getBalance());
        a1.deposit(-10);
        assertEquals(30.5, a1.getBalance());
    }

    @Test
    void withdraw() {
        Customer c1 = new Customer(1,"Felipe",'m');
        Account a1 = new Account(3,c1,20.5);
        a1.withdraw(10);
        assertEquals(10.5, a1.getBalance());
        a1.withdraw(50);
        assertEquals(10.5, a1.getBalance());
    }
}