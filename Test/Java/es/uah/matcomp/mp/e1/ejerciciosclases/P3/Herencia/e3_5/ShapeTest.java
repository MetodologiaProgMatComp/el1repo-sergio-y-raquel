package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        Shape s1=new Shape();
        assertEquals("red",s1.getColor());
    }

    @Test
    void setColor() {
        Shape s1=new Shape();
        s1.setColor("blue");
        assertEquals("blue",s1.getColor());
    }

    @Test
    void isFilled() {
        Shape s1=new Shape("green",false);
        assertFalse(s1.isFilled());
    }

    @Test
    void setFilled() {
        Shape s1=new Shape("green",false);
        s1.setFilled(true);
        assertTrue(s1.isFilled());
    }

    @Test
    void testToString() {
        Shape s1=new Shape("red",true);
        assertEquals("Shape[color= red, filled= true]",s1.toString());
    }
}