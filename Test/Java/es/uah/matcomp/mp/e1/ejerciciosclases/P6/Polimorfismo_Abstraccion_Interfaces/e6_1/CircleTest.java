package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(1, c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1 = new Circle(8);
        c1.setRadius(9);
        assertEquals(9, c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1 = new Circle("blue", true, 2);
        assertEquals(Math.PI * 4, c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1 = new Circle(8);
        assertEquals(16 * Math.PI, c1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c1 = new Circle("blue", true, 67);
        assertEquals("Circle[Shape[color= blue, filled= true], radius= 67.0]", c1.toString());
    }
}