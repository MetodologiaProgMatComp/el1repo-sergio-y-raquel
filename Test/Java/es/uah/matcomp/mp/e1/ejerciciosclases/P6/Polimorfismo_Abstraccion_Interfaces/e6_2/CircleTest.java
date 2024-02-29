package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void testToString() {
        Circle c1 = new Circle(3);
        assertEquals("Circle[radius= 3.0]", c1.toString());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(3);
        assertEquals(9 * Math.PI, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(3);
        assertEquals(6 * Math.PI, c1.getPerimeter());
    }
}