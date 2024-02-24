package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_8;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_8.MyCircle;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_8.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void getRadius() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getRadius(), 1);
    }

    @Test
    void setRadius() {
        MyCircle c1 = new MyCircle();
        c1.setRadius(2);
        assertEquals(c1.getRadius(), 2);
    }

    @Test
    void getCenter() {
        MyCircle c1 = new MyCircle(new MyPoint(0,0),1);
        MyPoint center = c1.getCenter();
        MyPoint pWanted = new MyPoint(0,0);
        assertEquals(center.toString(), pWanted.toString());
    }

    @Test
    void setCenter() {
        MyCircle c1 = new MyCircle();
        c1.setCenter(new MyPoint(1,2));
        MyPoint center = c1.getCenter();
        MyPoint pWanted = new MyPoint(1,2);
        assertEquals(center.toString(), pWanted.toString());
    }

    @Test
    void getCenterX() {
        MyCircle c1 = new MyCircle(1,2,5);
        assertEquals(c1.getCenterX(), 1);
    }

    @Test
    void setCenterX() {
        MyCircle c1 = new MyCircle(1,2,5);
        c1.setCenterX(3);
        assertEquals(c1.getCenterX(), 3);
    }

    @Test
    void getCenterY() {
        MyCircle c1 = new MyCircle(1,2,5);
        assertEquals(c1.getCenterY(), 2);
    }

    @Test
    void setCenterY() {
        MyCircle c1 = new MyCircle(1,2,5);
        c1.setCenterY(3);
        assertEquals(c1.getCenterY(), 3);
    }

    @Test
    void getCenterXY() {
        MyCircle c1 = new MyCircle();
        MyPoint center = c1.getCenter();
        MyPoint pWanted = new MyPoint(0,0);
        assertEquals(c1.getArrayToString(c1.getCenterXY()),pWanted.toString() );
    }

    @Test
    void getArrayToString() {
        MyCircle c1 = new MyCircle();
        c1.setCenterXY(1,2);
        MyPoint center = c1.getCenter();
        MyPoint pWanted = new MyPoint(1,2);
        assertEquals(c1.getArrayToString(center.getXY()), pWanted.toString());
    }

    @Test
    void setCenterXY() {
        MyCircle c1 = new MyCircle();
        c1.setCenterXY(1,2);
        MyPoint center = c1.getCenter();
        MyPoint pWanted = new MyPoint(1,2);
        assertEquals(c1.getArrayToString(center.getXY()), pWanted.toString());
    }

    @Test
    void testToString() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.toString(), "MyCicle[radius=1, center=(0,0)]");
    }

    @Test
    void getArea() {
        MyCircle c1 = new MyCircle();
        assertEquals(c1.getArea(), Math.PI);
    }

    @Test
    void getCircumference() {
        MyCircle c1 = new MyCircle(0,0,1);
        double areaWanted = 2*(Math.PI);
        assertEquals(c1.getCircumference(), areaWanted);
    }

    @Test
    void distance() {
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(0,2,1);
        assertEquals(c1.distance(c2), 2);
    }
}