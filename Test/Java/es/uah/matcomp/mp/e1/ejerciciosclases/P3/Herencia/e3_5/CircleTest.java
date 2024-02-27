package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1= new Circle();
        assertEquals(1.0,c1.getRadius());
    }

    @Test
    void setRadius() {
        Circle c1= new Circle(3.0);
        c1.setRadius(1.0);
        assertEquals(1.0,c1.getRadius());
    }

    @Test
    void getArea() {
        Circle c1= new Circle(3.0);
        assertEquals(9.0*Math.PI,c1.getArea());
    }

    @Test
    void getPerimeter() {
        Circle c1= new Circle(3.0);
        assertEquals(6.0*Math.PI,c1.getPerimeter());
    }

    @Test
    void testToString() {
        Circle c1=new Circle("red",true,4.0);
        assertEquals("Circle[Shape[color= red, filled= true], radius= 4.0]",c1.toString());
    }
}