package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void getSide() {
        Square s1 = new Square();
        assertEquals(1.0, s1.getSide());
    }

    @Test
    void setSide() {
        Square s1 = new Square(4);
        s1.setSide(89);
        assertEquals(89, s1.getSide());

    }

    @Test
    void setWidth() {
        Square s1 = new Square(4);
        s1.setWidth(89);
        assertEquals(89, s1.getSide());
    }

    @Test
    void setLength() {
        Square s1 = new Square(4);
        s1.setLength(89);
        assertEquals(89, s1.getSide());
    }

    @Test
    void testToString() {
        Square s1 = new Square("red", false, 4);
        assertEquals("Square[Rectangle[Shape[color= red, filled= false], width= 4.0, length= 4.0]]", s1.toString());
    }
}