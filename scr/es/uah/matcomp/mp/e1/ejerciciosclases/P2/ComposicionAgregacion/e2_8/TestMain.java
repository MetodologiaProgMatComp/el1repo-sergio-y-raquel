package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_8;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1= new MyCircle();
        int[] lcenter = c1.getCenterXY();
        System.out.println(c1+"\n"+
                c1.getRadius()+"\n"+
                c1.getCenter()+"\n"+
                c1.getCenterX()+"\n"+
                c1.getCenterY()+"\n"+
                c1.getArrayToString(lcenter)+"\n");
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference()+"\n");

        MyCircle c2 = new MyCircle(1,2,3);
        System.out.println(c2);
        System.out.println(c1.distance(c2)+"\n");

        MyCircle c3 = new MyCircle(new MyPoint(4,5),6);
        System.out.println(c3);
    }
}