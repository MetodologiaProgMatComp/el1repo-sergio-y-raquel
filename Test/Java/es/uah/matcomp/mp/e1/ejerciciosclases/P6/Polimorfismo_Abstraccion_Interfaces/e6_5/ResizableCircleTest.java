package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle r1= new ResizableCircle(7.9);
        assertEquals("ResizableCircle[Circle[radius= 7.9]]",r1.toString());
    }

    @Test
    void resize() {
        ResizableCircle r1= new ResizableCircle(7.9);
r1.resize(10);
assertEquals("ResizableCircle[Circle[radius= 0.79]]",r1.toString());
    }
}