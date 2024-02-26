package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D p1= new Point3D(3f,3f,3f);
        assertEquals(3,p1.getZ());
    }

    @Test
    void setZ() {
        Point3D p1= new Point3D(3f,3f,3f);
        p1.setZ(5f);
        assertEquals(5,p1.getZ());
    }

    @Test
    void setXYZ() {
        Point3D p1= new Point3D(3f,3f,3f);
        p1.setXYZ(5f,5f,5f);
        assertEquals(5,p1.getZ());
        assertEquals(5,p1.getY());
        assertEquals(5,p1.getX());
    }

    @Test
    void getXYZ() {
        Point3D p1= new Point3D(3f,3f,3f);
    }

    @Test
    void testToString() {
    }
}