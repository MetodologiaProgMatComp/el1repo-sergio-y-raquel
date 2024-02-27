package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_2;

import es.uah.matcomp.mp.e1.ejerciciosclases.P1.Clases.Ejemplo.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        this.base=new Circle();
        this.height=1.0;
    }
    public Cylinder(double rad){
        this.base=new Circle(rad);
        this.height=1.0;
    }
    public Cylinder(double rad,double h){
        this.base=new Circle(rad);
        this.height=h;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return base.getArea()*height;
    }
    public double getArea(){
        return 2*base.getArea()+2*Math.PI*base.getRadius()*height;
    }

    public String toString(){
        return "Cylinder[Base= "+base.toString()+", height= "+height+"]";
    }
}
