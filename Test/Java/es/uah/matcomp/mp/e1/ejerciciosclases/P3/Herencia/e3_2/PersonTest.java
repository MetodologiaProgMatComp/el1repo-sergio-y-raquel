package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    @Test
    void getName() {
        Person p1 = new Person("Juan", "Calle pio");
        assertEquals("Juan", p1.getName());
    }

    @Test
    void getAddress() {
        Person p1 = new Person("Juan", "Calle pio");
        assertEquals("Calle pio", p1.getAddress());
    }

    @Test
    void setAddress() {
        Person p1 = new Person("Juan", "Calle pio");
        p1.setAddress("Avenida grande");
        assertEquals("Avenida grande", p1.getAddress());
    }

    @Test
    void testToString() {
        Person p1 = new Person("Juan", "Calle pio");
        assertEquals("Person[name= Juan, address= Calle pio]", p1.toString());
    }
}