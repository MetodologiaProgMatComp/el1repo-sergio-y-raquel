package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0, r1.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle(6, 9);
        r1.setWidth(90);
        assertEquals(90, r1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle("Pink", true, 89, 90);
        assertEquals(90, r1.getLength());

    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle(6, 9);
        r1.setLength(7);
        assertEquals(7, r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(6, 9);
        assertEquals(54, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(6, 9);
        assertEquals(30, r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(6, 9);
        assertEquals("Rectangle[Shape[color= red, filled= true], width= 6.0, length= 9.0]", r1.toString());
    }
}