package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LineSubTest {

    @Test
    void getBegin() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertArrayEquals(new Point(0, 0).getXY(), l1.getBegin().getXY());
    }

    @Test
    void setBegin() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setBegin(5, 7);
        assertArrayEquals(new int[]{5, 7}, l1.getBegin().getXY());
    }

    @Test
    void getEnd() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertArrayEquals(new Point(5, 6).getXY(), l1.getEnd().getXY());
    }

    @Test
    void setEnd() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setEnd(new Point(5, 7));
        assertArrayEquals(new int[]{5, 7}, l1.getEnd().getXY());
    }

    @Test
    void getBeginX() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertEquals(0, l1.getBeginX());
    }

    @Test
    void getBeginY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertEquals(0, l1.getBeginY());
    }

    @Test
    void getEndX() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertEquals(5, l1.getEndX());
    }

    @Test
    void getEndY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        assertEquals(6, l1.getEndY());
    }

    @Test
    void setBeginX() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setBeginX(78);
        assertEquals(78, l1.getBeginX());
    }

    @Test
    void setBeginY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setBeginY(98);
        assertEquals(98, l1.getBeginY());
    }

    @Test
    void setBeginXY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setBeginXY(8, 9);
        assertArrayEquals(new int[]{8, 9}, l1.getBegin().getXY());
    }

    @Test
    void setEndX() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setEndX(78);
        assertEquals(78, l1.getEndX());
    }

    @Test
    void setEndY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setEndY(78);
        assertEquals(78, l1.getEndY());
    }

    @Test
    void setEndXY() {
        LineSub l1 = new LineSub(new Point(0, 0), new Point(5, 6));
        l1.setEndXY(new Point(78, 98));
        assertArrayEquals(new Point(78, 98).getXY(), l1.getEnd().getXY());
    }

    @Test
    void getLength() {
        LineSub l1 = new LineSub(3, 4, new Point(5, 6));
        assertEquals(Math.sqrt(8), l1.getLength());
    }

    @Test
    void getGradient() {
        LineSub l2 = new LineSub(3, 4, new Point(5, 6));
        assertEquals(Math.atan2((l2.getBeginX() - l2.getEndX()), (l2.getBeginY() - l2.getEndY())), l2.getGradient());

    }

    @Test
    void testToString() {
        LineSub l2 = new LineSub(3, 4, new Point(5, 6));
        assertEquals("LineSub{begin= end=Point: (5,6)}", l2.toString());
    }
}