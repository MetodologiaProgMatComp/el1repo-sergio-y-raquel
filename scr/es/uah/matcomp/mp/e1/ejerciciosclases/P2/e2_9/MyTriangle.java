package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_9;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    ////////////////////////////////////////////////////////////////////////////
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    ////////////////////////////////////////////////////////////////////////////

    public String toString() {
        return String.format("MyTriangle[v1=%s], v2=%s], v3=%s]]", v1.getXY(), v2.getXY(), v3.getXY());
    }

    public double getPerimeter() {
        return (v1.distance(v2) + v2.distance(v3) + v3.distance(v1));
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        String type;
        if (d1 == d2 && d1 == d3) {
            type = "Equilateral";
        } else if ((d1 == d2 && d2 != d3) || (d2 == d3 && d2 != d1) || (d3 == d1 && d1 != d2)) {
            type = "Isosceles";
        } else {
            type = "Scalene";
        }
        return type;
    }
}
