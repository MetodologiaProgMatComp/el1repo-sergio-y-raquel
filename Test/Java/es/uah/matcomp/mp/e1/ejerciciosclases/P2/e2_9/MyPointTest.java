package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_9;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_9.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void getX() {
        MyPoint p1 = new MyPoint(1,2);
        assertEquals(1,p1.getX());
    }

    @Test
    void setX() {
        MyPoint p1 = new MyPoint(1,2);
        p1.setX(3);
        assertEquals(3,p1.getX());
    }

    @Test
    void getY() {
        MyPoint p1 = new MyPoint(1,2);
        assertEquals(2,p1.getY());
    }

    @Test
    void setY() {
        MyPoint p1 = new MyPoint(1,2);
        p1.setY(4);
        assertEquals(4,p1.getY());
    }

    @Test
    void getXY() {
        MyPoint p1 = new MyPoint(1,2);
        assertEquals("{1.0,2.0}",p1.getArrayToString(p1.getXY()));
    }

    @Test
    void getArrayToString() {
        MyPoint p1 = new MyPoint(1,2);
        assertEquals("{1.0,2.0}",p1.getArrayToString(p1.getXY()));
    }

    @Test
    void setXY() {
        MyPoint p1 = new MyPoint(1,2);
        p1.setXY(3,4);
        assertEquals("{3.0,4.0}",p1.getArrayToString(p1.getXY()));
    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(1,2);
        assertEquals("(1.0,2.0)", p1.toString());
    }

    @Test
    void testDistance1() {
        MyPoint p1 = new MyPoint();
        double d1 = Math.sqrt(5);
        assertEquals(p1.distance(1,2),d1);
    }

    @Test
    void testDistance2() {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(1,2);
        double d1 = Math.sqrt(5);
        assertEquals(p1.distance(p2),d1);
    }

    @Test
    void testDistance3() {
        MyPoint p1 = new MyPoint(1,2);
        double d1 = Math.sqrt(5);
        assertEquals(p1.distance(),d1);
    }
}