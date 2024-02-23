package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyTriangle t1 = new MyTriangle(new MyPoint(1,2),new MyPoint(3,4),new MyPoint(5,6));
        assertEquals(t1.toString(), "MyTriangle[v1={1.0,2.0}], v2={3.0,4.0}], v3={5.0,6.0}]]");
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(1,2,3,4,5,6);
        assertEquals(t1.getPerimeter(),11.313708498984761);
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle(new MyPoint(2.5, ((5*(Math.sqrt(3))/2))), new MyPoint(0, 0), new MyPoint(5, 0));
        MyTriangle t2 = new MyTriangle(-1, 1, -1, -2, 2, 1);
        MyTriangle t3 = new MyTriangle(0, 0, 1, 1, 8, 2);
        assertEquals(t1.getType(),"Equilateral");
        assertEquals(t2.getType(),"Isosceles");
        assertEquals(t3.getType(),"Scalene");
    }
}