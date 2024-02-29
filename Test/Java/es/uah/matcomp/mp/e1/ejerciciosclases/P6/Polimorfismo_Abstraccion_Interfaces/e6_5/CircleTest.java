package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void testToString() {
        Circle c1 = new Circle(4.5);
        assertEquals("Circle[radius= 4.5]", c1.toString());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(4.5);
        assertEquals(9 * Math.PI, c1.getPerimeter());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle(4.5);
        assertEquals(Math.PI * 20.25, c1.getArea());
    }
}