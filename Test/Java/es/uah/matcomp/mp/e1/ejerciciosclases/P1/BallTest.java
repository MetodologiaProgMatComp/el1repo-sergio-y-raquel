package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertEquals(1.5f, ball.getX());
    }

    @Test
    void setX() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertDoesNotThrow(() -> ball.setX(1.25f));
        float x = ball.getX();
        assertEquals(1.25f, x);
    }

    @Test
    void getY() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertEquals(2.5f, ball.getY());
    }

    @Test
    void setY() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertDoesNotThrow(() -> ball.setY(2.25f));
        float y = ball.getY();
        assertEquals(2.25f, y);
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertEquals(3, ball.getRadius());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertDoesNotThrow(() -> ball.setRadius(4));
        float r = ball.getRadius();
        assertEquals(4, r);
    }

    @Test
    void getxDelta() {Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertEquals(0.5f, ball.getxDelta());
    }

    @Test
    void setxDelta() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertDoesNotThrow(() -> ball.setxDelta(1.5f));
        float dx = ball.getxDelta();
        assertEquals(1.5f, dx);
    }

    @Test
    void getyDelta() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertEquals(0.8f, ball.getyDelta());
    }

    @Test
    void setyDelta() {
        Ball ball = new Ball(1.5f,2.5f,3,0.5f,0.8f);
        assertDoesNotThrow(() -> ball.setyDelta(1.25f));
        float dy = ball.getyDelta();
        assertEquals(1.25f, dy);
    }

    @Test
    void move() {
        Ball ball = new Ball(1.5f,2.5f,3,0.75f,0.8f);
        assertDoesNotThrow(() -> ball.move());
        float newx = ball.getX();
        float newy = ball.getY();
        assertEquals(2.25f, newx);
        assertEquals(3.3f, newy);
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1.5f,2.5f,3,0.75f,0.8f);
        assertDoesNotThrow(() -> ball.reflectHorizontal());
        float newdx = ball.getxDelta();
        assertEquals(-0.75f, newdx);
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(1.5f,2.5f,3,0.75f,0.8f);
        assertDoesNotThrow(() -> ball.reflectVertical());
        float newdy = ball.getyDelta();
        assertEquals(-0.8f, newdy);
    }

    @Test
    void testToString() {
        Ball ball = new Ball(1.5f,2.5f,3,0.75f,0.8f);
        assertEquals("Ball[(1.5, 2.5), speed=(0.75, 0.8)]", ball.toString());
    }
}