package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        assertEquals(3.0f,p1.getxSpeed());
    }

    @Test
    void setxSpeed() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        p1.setxSpeed(5.0f);
        assertEquals(5.0f,p1.getxSpeed());
    }

    @Test
    void getySpeed() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        assertEquals(3.0f,p1.getySpeed());
    }

    @Test
    void setySpeed() {
        MovablePoint p1=new MovablePoint();
        p1.setySpeed(5.0f);
        assertEquals(5.0f,p1.getySpeed());
    }

    @Test
    void setSpeed() {
        MovablePoint p1=new MovablePoint(3.0f,3.0f);
        p1.setSpeed(5.0f,9.0f);
        assertEquals(5.0f,p1.getxSpeed());
        assertEquals(9.0f,p1.getySpeed());
    }

    @Test
    void getSpeed() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        assertEquals("{3.0,3.0}",p1.getArrayToString(p1.getSpeed()));
    }

    @Test
    void testToString() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        assertEquals("(1.0,1.0), speed= (3.0, 3.0)",p1.toString());
    }

    @Test
    void move() {
        MovablePoint p1=new MovablePoint(1.0f,1.0f,3.0f,3.0f);
        assertEquals("(4.0,4.0), speed= (3.0, 3.0)",p1.move().toString());
    }
}