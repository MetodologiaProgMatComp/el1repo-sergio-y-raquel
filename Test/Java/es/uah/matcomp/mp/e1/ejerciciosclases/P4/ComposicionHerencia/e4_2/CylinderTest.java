package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder c1 = new Cylinder();
        assertEquals(1.0, c1.getHeight());
    }

    @Test
    void setHeight() {
        Cylinder c1 = new Cylinder();
        c1.setHeight(8.09);
        assertEquals(8.09, c1.getHeight());
    }

    @Test
    void getVolume() {
        Cylinder c1 = new Cylinder(23);
        assertEquals(529 * Math.PI, c1.getVolume());
    }

    @Test
    void getArea() {
        Cylinder c1 = new Cylinder(23, 40);
        assertEquals(529 * Math.PI * 2 + 2 * Math.PI * 23 * 40, c1.getArea());
    }

    @Test
    void testToString() {
        Cylinder c1 = new Cylinder();
        assertEquals("Cylinder[Base= Circle[radius= 1.0, color= red], height= 1.0]", c1.toString());
    }
}