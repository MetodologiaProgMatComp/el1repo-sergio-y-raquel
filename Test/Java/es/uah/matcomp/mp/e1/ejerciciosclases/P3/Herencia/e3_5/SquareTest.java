package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getSide() {
        Square s1=new Square();
        assertEquals(1.0,s1.getSide());
    }

    @Test
    void setSide() {
        Square s1=new Square(3.0);
        s1.setSide(9.0);
        assertEquals(9.0,s1.getSide());
    }

    @Test
    void setWidth() {
        Square s1=new Square(3.0);
        s1.setWidth(8.0);
        assertEquals(8.0,s1.getWidth());
    }

    @Test
    void setLength() {
        Square s1=new Square(3.0);
        s1.setLength(8.0);
        assertEquals(8.0,s1.getLength());
    }

    @Test
    void testToString() {
        Square s1=new Square("Yellow",true,4.0);
        assertEquals("Square[Rectangle[Shape[color= Yellow, filled= true], width= 4.0, length= 4.0]]",s1.toString());
    }
}