package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void testToString() {
        Point p1 = new Point(8, 9);
        assertEquals("Point: (8,9)", p1.toString());
    }

    @Test
    void getX() {
        Point p1 = new Point(8, 9);
        assertEquals(8, p1.getX());
    }

    @Test
    void setX() {
        Point p1 = new Point(8, 9);
        p1.setX(2);
        assertEquals(2, p1.getX());
    }

    @Test
    void getY() {
        Point p1 = new Point(8, 9);
        assertEquals(9, p1.getY());
    }

    @Test
    void setY() {
        Point p1 = new Point(8, 9);
        p1.setY(4);
        assertEquals(4, p1.getY());
    }

    @Test
    void setXY() {
        Point p1 = new Point(8, 9);
        p1.setXY(5, 6);
        assertArrayEquals(new int[]{5, 6}, p1.getXY());
    }

    @Test
    void getXY() {
        Point p1 = new Point(8, 9);
        assertArrayEquals(new int[]{8, 9}, p1.getXY());
    }
}