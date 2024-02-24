package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

public class TestLine {
    public static void main(String[] args){
        Line l1= new Line(0,0,3,4);
        System.out.println(l1);

        Point p1= new Point(0,9);
        Point p2=new Point(9,0);
        Line l2=new Line(p1,p2);
        System.out.println(l2);
        System.out.println(l2.getLenght());
        System.out.println(l2.getGradient());
    }
}
