package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_1;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Clases.Ejemplo.Circle;

public class Cylinder extends Circle {
    private double height;

    ///////////////

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double rad) {
        super(rad);
        height = 1.0;
    }

    public Cylinder(double rad, double height) {
        super(rad);
        this.height = height;
    }

    public Cylinder(double rad, double h, String c) {
        super(rad, c);
        this.height = h;
    }

    /////////////

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + ", height=" + height;
    }
}
