package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_5;

public class Main {
    public static void main(String[] args){
        Circle c1= new Circle(45);
        System.out.println(c1);
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        ResizableCircle rc1= new ResizableCircle(45);
        System.out.println(rc1);
        rc1.resize(10);
        System.out.println(rc1);
    }
}
