package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle rectangle = new Rectangle();
        float l = rectangle.getLength();
        assertNotEquals(rectangle.lenght, 0L);
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
        float longitud=rectangle.getLength();
        assertEquals(longitud,5.0f);
        assertTrue(longitud>0f);
    }

    @Test
    void setWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(8.0f);
        float ancho=rectangle.getWidth();
        assertEquals(ancho,8.0f);
        assertDoesNotThrow(()-> rectangle.setWidth(8.0f));
    }

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(1.0f,2.0f);
        assertEquals(rectangle.getArea(),2.0f);
        assertTrue(rectangle.getArea()>0);
        assertDoesNotThrow(()-> rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        Rectangle rectangle = new Rectangle(3.0f,2.0f);
        assertEquals(10.0f,rectangle.getPerimeter());
        assertDoesNotThrow(()->rectangle.getPerimeter());

    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(3.0f,2.0f);
        assertEquals("Rectangle[length= 3.0, width 2.0]",rectangle.toString());

    }
}