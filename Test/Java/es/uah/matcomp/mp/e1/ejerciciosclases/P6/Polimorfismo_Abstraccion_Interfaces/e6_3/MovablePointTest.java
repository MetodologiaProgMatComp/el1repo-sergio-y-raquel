package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint mp1 = new MovablePoint(3, 3, 3, 3);
        assertEquals("(3,3) speed=(3, 3)", mp1.toString());
    }

    @Test
    void moveUP() {
        MovablePoint p1 = new MovablePoint(3, 3, 3, 3);
        p1.moveUP();
        assertEquals("(3,6) speed=(3, 3)", p1.toString());
    }

    @Test
    void moveDown() {
        MovablePoint p1 = new MovablePoint(3, 3, 3, 3);
        p1.moveDown();
        assertEquals("(3,0) speed=(3, 3)", p1.toString());
    }

    @Test
    void moveLeft() {
        MovablePoint p1 = new MovablePoint(3, 3, 3, 3);
        p1.moveLeft();
        assertEquals("(0,3) speed=(3, 3)", p1.toString());
    }

    @Test
    void moveRight() {
        MovablePoint p1 = new MovablePoint(3, 3, 3, 3);
        p1.moveRight();
        assertEquals("(6,3) speed=(3, 3)", p1.toString());
    }
}