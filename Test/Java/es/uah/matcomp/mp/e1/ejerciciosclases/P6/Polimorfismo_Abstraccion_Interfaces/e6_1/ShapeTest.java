package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1 = new Rectangle("Red", true, 9, 9);
        assertEquals("Red", s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1 = new Rectangle("Red", true, 9, 9);
        s1.setColor("Blue");
        assertEquals("Blue", s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1 = new Rectangle("Red", true, 9, 9);
        assertTrue(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1 = new Rectangle("Red", true, 9, 9);
        s1.setFilled(false);
        assertFalse(s1.isFilled());
    }

    @Test
    void testToString() {
        Shape s1 = new Rectangle();
        assertEquals("Rectangle[Shape[color= red, filled= true], width= 1.0, length= 1.0]", s1.toString());
    }
}