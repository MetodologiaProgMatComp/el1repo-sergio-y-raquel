package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_9;

public class TestMain {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(new MyPoint(0, 0), new MyPoint(6, 0), new MyPoint(3, 5));
        MyTriangle t2 = new MyTriangle(-1, 1, -1, -2, 2, 1);
        MyTriangle t3 = new MyTriangle(0, 0, 1, 1, 0, 2);
        System.out.println(t1.getPerimeter());
        System.out.println();
        System.out.println(t1);
        System.out.println(t1.getType());
        System.out.println(t2);
        System.out.println(t2.getType());
        System.out.println(t3);
        System.out.println(t3.getType());
    }
}
