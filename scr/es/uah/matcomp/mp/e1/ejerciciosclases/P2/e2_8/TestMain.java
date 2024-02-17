package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_8;

import es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_7.MyLine;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1= new MyCircle();
        System.out.println(c1+"\n"+
                c1.getRadius()+"\n"+
                c1.getCenter()+"\n"+
                c1.getCenterX()+"\n"+
                c1.getCenterY()+"\n"+
                c1.getCenterXY()+"\n");
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference()+"\n");
        MyCircle c2 = new MyCircle(1,2,3);
        System.out.println(c2);
        System.out.println(c1.distance(c2)+"\n");
        MyCircle c3 = new MyCircle(new MyPoint(4,5),6);
        System.out.println(c3);
    }
}