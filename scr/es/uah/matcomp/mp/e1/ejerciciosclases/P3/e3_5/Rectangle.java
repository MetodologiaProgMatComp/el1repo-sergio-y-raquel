package es.uah.matcomp.mp.e1.ejerciciosclases.P3.e3_5;

public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    /////////////
    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString(){
        return "Rectangle["+super.toString()+", width= "+width+", length= "+length+"]";
    }
}
