package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(4, 5);
        assertEquals("Rectangle[width= 4.0, length= 5.0]", r1.toString());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(4, 5);
        assertEquals(20, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(4, 5);
        assertEquals(18, r1.getPerimeter());
    }
}