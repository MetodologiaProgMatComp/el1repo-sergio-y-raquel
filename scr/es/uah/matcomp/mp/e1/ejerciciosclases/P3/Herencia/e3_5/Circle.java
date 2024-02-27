package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

public class Circle extends Shape {
    private double radius=1.0;

    ///////////////
    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    ////////////////

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle["+super.toString()+", radius= "+radius+"]";
    }
}
