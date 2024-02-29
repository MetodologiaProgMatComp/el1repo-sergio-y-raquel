package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(3, 4, 5, 6);
        System.out.println(p1);
        p1.moveDown();
        p1.moveDown();
        p1.moveLeft();
        p1.moveLeft();
        System.out.println(p1);
    }
}
