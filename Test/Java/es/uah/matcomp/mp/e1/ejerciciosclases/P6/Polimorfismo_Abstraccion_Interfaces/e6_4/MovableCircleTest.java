package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle c1=new MovableCircle(3,3,3,3,89);
        assertEquals("(3,3) speed=(3, 3), radius= 89",c1.toString());
    }

    @Test
    void moveUP() {
        MovableCircle c1=new MovableCircle(3,3,3,3,89);
        c1.moveUP();
        assertEquals("(3,6) speed=(3, 3), radius= 89",c1.toString());
    }

    @Test
    void moveDown() {
        MovableCircle c1=new MovableCircle(3,3,3,3,89);
        c1.moveDown();
        assertEquals("(3,0) speed=(3, 3), radius= 89",c1.toString());
    }

    @Test
    void moveLeft() {
        MovableCircle c1=new MovableCircle(3,3,3,3,89);
        c1.moveLeft();
        assertEquals("(0,3) speed=(3, 3), radius= 89",c1.toString());
    }

    @Test
    void moveRight() {
        MovableCircle c1=new MovableCircle(3,3,3,3,89);
        c1.moveRight();
        assertEquals("(6,3) speed=(3, 3), radius= 89",c1.toString());
    }
}