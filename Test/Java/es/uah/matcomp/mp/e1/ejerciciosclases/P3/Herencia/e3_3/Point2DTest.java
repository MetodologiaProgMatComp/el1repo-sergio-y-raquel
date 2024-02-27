package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D p1= new Point2D();
        assertEquals(0,p1.getX());
    }

    @Test
    void setX() {
        Point2D p1=new Point2D();
        p1.setX(4.0f);
        assertEquals(4.0f,p1.getX());
    }

    @Test
    void getY() {
        Point2D p1= new Point2D();
        assertEquals(0,p1.getY());
    }

    @Test
    void setY() {
        Point2D p1=new Point2D();
        p1.setY(4.0f);
        assertEquals(4.0f,p1.getY());
    }

    @Test
    void setXY() {
        Point2D p1=new Point2D();
        p1.setXY(3.0f,4.0f);
        assertEquals(4.0f,p1.getY());
        assertEquals(3.0f,p1.getX());
    }

    @Test
    void getXY() {
        Point2D p1=new Point2D(80f,90f);
        assertEquals("{80.0,90.0}",p1.getArrayToString(p1.getXY()));
    }

    @Test
    void testToString() {
        Point2D p1=new Point2D(5f,6f);
        assertEquals("(5.0,6.0)",p1.toString());
    }
}