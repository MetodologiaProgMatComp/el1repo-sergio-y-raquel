package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_7;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_7.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_7.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyLine l1 = new MyLine(new MyPoint(1,2),new MyPoint(3,4));
        MyPoint begin = l1.getBegin();
        assertEquals(l1.getArrayToString(begin.getXY()),"{1,2}");
    }

    @Test
    void setBegin() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBegin(new MyPoint(5,6));
        MyPoint begin = l1.getBegin();
        assertEquals(l1.getArrayToString(begin.getXY()),"{5,6}");
    }

    @Test
    void getEnd() {
        MyLine l1 = new MyLine(1,2,3,4);
        MyPoint end = l1.getEnd();
        assertEquals(l1.getArrayToString(end.getXY()),"{3,4}");
    }

    @Test
    void setEnd() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEnd(new MyPoint(7,8));
        MyPoint end = l1.getEnd();
        assertEquals(l1.getArrayToString(end.getXY()),"{7,8}");
    }

    @Test
    void getBeginX() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getBeginX(),1);
    }

    @Test
    void setBeginX() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBeginX(5);
        assertEquals(l1.getBeginX(),5);
    }

    @Test
    void getBeginY() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getBeginY(),2);
    }

    @Test
    void setBeginY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBeginY(6);
        assertEquals(l1.getBeginY(),6);
    }

    @Test
    void getEndX() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getEndX(),3);
    }

    @Test
    void setEndX() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEndX(7);
        assertEquals(l1.getEndX(),7);
    }

    @Test
    void getEndY() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getEndY(),4);
    }

    @Test
    void setEndY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEndY(8);
        assertEquals(l1.getEndY(),8);
    }

    @Test
    void getBeginXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getArrayToString(l1.getBeginXY()),"{1,2}");
    }

    @Test
    void getArrayToString() {
        MyLine l1 = new MyLine(1,2,3,4);
        MyPoint begin = l1.getBegin();
        assertEquals(l1.getArrayToString(begin.getXY()),"{1,2}");
    }

    @Test
    void setBeginXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setBeginXY(5,6);
        assertEquals(l1.getArrayToString(l1.getBeginXY()),"{5,6}");
    }

    @Test
    void getEndXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.getArrayToString(l1.getEndXY()),"{3,4}");
    }

    @Test
    void setEndXY() {
        MyLine l1 = new MyLine(1,2,3,4);
        l1.setEndXY(7,8);
        assertEquals(l1.getArrayToString(l1.getEndXY()),"{7,8}");
    }

    @Test
    void getLength() {
        MyLine l1 = new MyLine(0,0,0,2);
        assertEquals(l1.getLength(), 2);
    }

    @Test
    void getGradient() {
        MyLine l1 = new MyLine(4,3,2,1);
        assertEquals(l1.getGradient(), Math.atan2(2, 2));
    }

    @Test
    void testToString() {
        MyLine l1 = new MyLine(1,2,3,4);
        assertEquals(l1.toString(), "MyLine[begin=(1,2), end(3,4)]");
    }
}