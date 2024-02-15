package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle c = new Circle();
        double rad = c.getRadius();
        assertNotEquals(rad, 0L);
        assertTrue(rad > 0);

    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(8.0);
        assertNotEquals(c.radius, 0.0);
        assertTrue(c.radius > 0);
        assertDoesNotThrow(()-> c.setRadius(8.0));
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle c = new Circle();
        double area = c.getArea();
        assertEquals(Math.PI, area);
        assertTrue(area>=0);
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle c= new Circle(9.0);
        double circ=c.getCircumference();
        assertEquals(18.0*Math.PI,circ);
        assertTrue(circ>=0);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle c= new Circle(9.0);
        assertEquals("Circle[radius= 9.0]",c.toString());
    }
}