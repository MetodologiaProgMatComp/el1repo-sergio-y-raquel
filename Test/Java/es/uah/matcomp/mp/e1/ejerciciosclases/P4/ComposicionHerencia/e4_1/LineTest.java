package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);

    @Test
    void testToString() {
        Line l1 = new Line(p1, p2);
        assertEquals("Line{begin=Point: (0,0), end=Point: (3,4)}", l1.toString());
    }

    @Test
    void getBegin() {
        Line l1 = new Line(p1, p2);
        assertEquals(p1, l1.getBegin());
    }

    @Test
    void setBegin() {
        Point p3 = new Point(9, 7);
        Line l1 = new Line(p1, p2);
        l1.setBegin(p3);
        assertEquals(p3, l1.getBegin());

    }

    @Test
    void getEnd() {
        Line l1 = new Line(p1, p2);
        assertEquals(p2, l1.getEnd());

    }

    @Test
    void setEnd() {
        Point p3 = new Point(9, 7);
        Line l1 = new Line(p1, p2);
        l1.setEnd(p3);
        assertEquals(p3, l1.getEnd());

    }

    @Test
    void getBeginX() {
        Line l1 = new Line(p1, p2);
        assertEquals(0, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        Line l1 = new Line(p1, p2);
        assertEquals(0, l1.getBeginY());
    }

    @Test
    void getEndX() {
        Line l1 = new Line(p1, p2);
        assertEquals(3, l1.getEndX());
    }

    @Test
    void getEndY() {
        Line l1 = new Line(p1, p2);
        assertEquals(4, l1.getEndY());
    }

    @Test
    void setBeginX() {
        Line l1 = new Line(p1, p2);
        l1.setBeginX(3);
        assertEquals(3, l1.getBeginX());
    }

    @Test
    void setBeginY() {
        Line l1 = new Line(p1, p2);
        l1.setBeginY(3);
        assertEquals(3, l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        Line l1 = new Line(p1, p2);
        l1.setBeginXY(4, 6);
        assertEquals(4, l1.getBeginX());
        assertEquals(6, l1.getBeginY());
    }

    @Test
    void setEndX() {
        Line l1 = new Line(p1, p2);
        l1.setEndX(8);
        assertEquals(8, l1.getEndX());
    }

    @Test
    void setEndY() {
        Line l1 = new Line(p1, p2);
        l1.setEndY(8);
        assertEquals(8, l1.getEndY());
    }

    @Test
    void setEndXY() {
        Line l1 = new Line(p1, p2);
        l1.setEndXY(7, 8);
        assertEquals(7, l1.getEndX());
        assertEquals(8, l1.getEndY());
    }

    @Test
    void getLength() {
        Line l2 = new Line(3, 4, 5, 6);
        assertEquals(Math.sqrt(8), l2.getLength());
    }

    @Test
    void getGradient() {
        Line l2 = new Line(3, 4, 5, 6);
        assertEquals(Math.atan2((l2.getBeginX() - l2.getEndX()), (l2.getBeginY() - l2.getEndY())), l2.getGradient());
    }
}