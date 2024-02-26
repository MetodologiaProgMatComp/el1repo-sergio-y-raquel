package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2.5, 3.0);
        assertEquals(3.0, c2.getHeight());
        assertEquals(1.0, c1.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder c1 = new Cylinder();
        c1.setHeight(4.0);
        assertEquals(4.0, c1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder(4.0);
        assertEquals(c1.getRadius() * c1.getRadius() * Math.PI * c1.getHeight(), c1.getVolume());
    }

    @Test
    void getArea() {
        Cylinder c1 = new Cylinder(3.0, 4.0);
        assertEquals(2 * Math.PI * c1.getRadius() * c1.getHeight() + 2 * c1.getRadius() * c1.getRadius() * Math.PI, c1.getArea());
    }

    @Test
    void testToString() {
        Cylinder c1 = new Cylinder(3.0, 3.0, "purple");
        assertEquals("Cylinder: subclass of Circle[radius= 3.0, color= purple], height= 3.0", c1.toString());
    }
}