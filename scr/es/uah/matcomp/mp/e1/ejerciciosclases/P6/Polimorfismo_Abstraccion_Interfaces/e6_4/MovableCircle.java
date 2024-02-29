package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_4;

import es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_3.*;
public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xS, int yS, int radius) {
        this.radius = radius;
        MovablePoint centro = new MovablePoint(x, y, xS, yS);
        this.center = centro;
    }

    public String toString() {
        return center.toString() + ", radius= " + radius;
    }

    @Override
    public void moveUP() {
        center.moveUP();

    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
