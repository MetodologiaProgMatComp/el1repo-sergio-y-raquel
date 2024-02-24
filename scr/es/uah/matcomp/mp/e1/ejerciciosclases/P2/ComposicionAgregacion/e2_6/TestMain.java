package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_6;

import java.text.DecimalFormat;

public class TestMain {
    public static void main(String[] args) {
        //Example distance(x,y)
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));

        //Example distance(another)
        MyPoint p2 = new MyPoint(3, 4);
        MyPoint p3 = new MyPoint(5, 6);
        System.out.println(p2.distance(p3));

        //Example distance()
        MyPoint p4 = new MyPoint(3, 4);
        System.out.println(p4.distance());

        // Test program to test all constructors and public methods
        MyPoint p5 = new MyPoint(); // Test constructor
        System.out.println(p5); // Test toString()
        p5.setX(8); // Test setters
        p5.setY(6);
        System.out.println("x is: " + p5.getX()); // Test getters
        System.out.println("y is: " + p5.getY());
        p5.setXY(3, 0); // Test setXY()
        System.out.println(p5.getXY()[0]); // Test getXY()
        System.out.println(p5.getXY()[1]);
        int[] lpoint = p5.getXY();
        System.out.println(p5.getArrayToString(lpoint));
        System.out.println(p5);
        MyPoint p6 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p6);
        // Testing the overloaded methods distance()
        System.out.println(p5.distance(p6)); // which version?
        System.out.println(p6.distance(p5)); // which version?
        System.out.println(p5.distance(5, 6)); // which version?
        System.out.println(p5.distance()+"\n\n"); // which version?


        ///////////////Matriz//////////////////
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++){
            points[i] = new MyPoint(i+1,i+1);
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(points + "\t" );
            for(int j = 0; j < 10; j++) {
                double distance = points[i].distance(points[j]);
                DecimalFormat df = new DecimalFormat("#00.00");
                String distanceRounded = df.format(distance);
                System.out.print(distanceRounded + "\t" );
            }
            System.out.println();
        }
    }
}
