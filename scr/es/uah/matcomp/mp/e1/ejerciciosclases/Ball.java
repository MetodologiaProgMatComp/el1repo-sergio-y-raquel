package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Ball {
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    public void ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.radius = radius;
        this.y = y;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta -= 2 * xDelta;
    }

    public void reflectVertical() {
        yDelta -= 2 * yDelta;
    }

    public String toString() {
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}
