package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

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
        Rectangle r1 = new Rectangle();
        r1.setWidth(1.5);
        assertEquals(1.5, r1.getWidth());
    }

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle(3.0, 2.0);
        assertEquals(2.0, r1.getLength());
    }

    @Test
    void setLength() {
        Rectangle r1 = new Rectangle("green", true, 3.0, 4.0);
        r1.setLength(5.0);
        assertEquals(5.0, r1.getLength());
    }

    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(3.0, 2.0);
        assertEquals(6.0, r1.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(3.0, 2.0);
        assertEquals(10.0, r1.getPerimeter());
    }

    @Test
    void testToString() {
        Rectangle r1 = new Rectangle("green", true, 3.0, 4.0);
        assertEquals("Rectangle[Shape[color= green, filled= true], width= 3.0, length= 4.0]", r1.toString());
    }
}