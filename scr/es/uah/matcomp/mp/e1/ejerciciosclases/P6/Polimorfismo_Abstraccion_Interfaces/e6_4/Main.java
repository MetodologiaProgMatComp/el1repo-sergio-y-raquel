package es.uah.matcomp.mp.e1.ejerciciosclases.P6.Polimorfismo_Abstraccion_Interfaces.e6_4;

public class Main {
    public static void main(String[] Args){
        MovableCircle c1=new MovableCircle(3,4,2,9,8);
        System.out.println(c1);
        c1.moveDown();
        c1.moveUP();
        System.out.println(c1);
        c1.moveLeft();
        c1.moveUP();
        System.out.println(c1);
    }
}
