package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_2;

public class Circle implements GeometricObject {
    private double radius;

    /////////////
    public Circle(double radius) {
        this.radius = radius;
    }
    //////////////

    public String toString(){
        return "Circle[radius= "+radius+"]";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
