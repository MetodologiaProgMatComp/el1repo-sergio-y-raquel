package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {
    Employee em1 = new Employee(1, "Juan", "Ruiz", 400);

    @Test
    void getId() {
        assertEquals(em1.getId(), 1);
        assertTrue(em1.getId() > 0);
    }

    @Test
    void getFirstName() {
        assertEquals(em1.getFirstName(), "Juan");
    }

    @Test
    void getLastName() {
        assertEquals(em1.getLastName(), "Ruiz");
    }

    @Test
    void getName() {
        assertEquals(em1.getName(), "Juan Ruiz");
    }

    @Test
    void getSalary() {
        assertEquals(em1.getSalary(), 400);
        assertTrue(em1.getSalary() > 0);
    }

    @Test
    void setSalary() {
        em1.setSalary(300);
        assertEquals(em1.getSalary(), 300);
    }

    @Test
    void getAnnualSalary() {
        assertEquals(em1.getAnnualSalary(), 4800);
        assertTrue(em1.getAnnualSalary() > 0);
    }

    @Test
    void raiseSalary() {
        assertEquals(em1.raiseSalary(10), 440);
    }

    @Test
    void testToString() {
        assertEquals(em1.toString(), "Employee[id= 1, name= Juan Ruiz, salary= 400]");
    }
}