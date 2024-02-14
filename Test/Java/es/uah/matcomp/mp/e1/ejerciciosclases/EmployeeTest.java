package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void employee() {
        Employee em  = new Employee();
        assertDoesNotThrow(()->em.employee(1,"Juan","Rodriguez",300));
    }

    @org.junit.jupiter.api.Test
    void getId() {
        Employee em  = new Employee();
        int id = em.getId();
        assertNotEquals(id, 0);
        assertTrue((id>0),"Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        /***
         * Preguntar al profesor que que "assert" hay que usar
         */
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        //Equals
    }

    @org.junit.jupiter.api.Test
    void getName() {
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        Employee em  = new Employee();
        int sal = em.getSalary();
        assertNotEquals(sal, 0);
        assertTrue((sal>0),"Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void setSalary() {
        Employee em  = new Employee();
        assertDoesNotThrow(()->em.setSalary(300));
    }

    @org.junit.jupiter.api.Test
    void getAnnualSalary() {
        Employee em  = new Employee();
        int sal = em.getAnnualSalary();
        assertNotEquals(sal, 0);
        assertTrue((sal>0),"Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee em  = new Employee();
        double sal = em.raiseSalary(10.7);
        assertNotEquals(sal, 0.0);
        assertTrue((sal>0),"Error, es menor o igual a 0");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}