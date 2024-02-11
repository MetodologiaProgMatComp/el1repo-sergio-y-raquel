package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle{
    double radius=1.0;

    public void circle(){
        radius=1.0;
    }
    public void circle(double rad){
        this.radius=rad;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Circle[radius= " + radius +"]";
    }
}
