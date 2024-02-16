package es.uah.matcomp.mp.e1.ejerciciosclases.P1.Ejemplo;

/***
 * The Circle Class models a circle with a radius and color
 */

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructores

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double r) {
        this.radius = r;
        this.color = "green";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    //Getters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    //Setters

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    //Método ToString
    public String toString() {
        return "Circle[radius= " + radius + ", color= " + color + "]";
    }
}
