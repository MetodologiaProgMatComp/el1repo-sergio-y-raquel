package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle();
        float l = rectangle.getLength();
        assertNotEquals(l, 0L);
        assertTrue(l > 0L);
    }

    @Test
    void getWidth() {
        Rectangle rectangle = new Rectangle();
        float w = rectangle.getWidth();
        assertNotEquals(w, 0L);
        assertTrue(w > 0L);
    }

    @Test
    void setLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5.0f);
    }

    @Test
    void setWidth() {
    }

    @Test
    void getArea() {
    }

    @Test
    void getPerimeter() {
    }

    @Test
    void testToString() {
    }
}