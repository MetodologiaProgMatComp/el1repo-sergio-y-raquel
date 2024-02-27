package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PointTest {

    @Test
    void getX() {
        Point p1 = new Point();
        assertEquals(0f, p1.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point();
        p1.setX(1f);
        assertEquals(1f, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point();
        assertEquals(0f, p1.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point();
        p1.setY(1f);
        assertEquals(1f, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(3.0f, 4.0f);
        p1.setXY(1.0f, 1.0f);
        assertEquals(1.0f, p1.getX());
        assertTrue(1.0f == p1.getY());
    }

    @Test
    void getXY() {
        Point p1 = new Point(3.0f, 4.0f);
        assertEquals("{3.0,4.0}", p1.getArrayToString(p1.getXY()));
    }

    @Test
    void testToString() {
        Point p1 = new Point(3.0f, 4.0f);
        assertEquals("(3.0,4.0)", p1.toString());
    }
}