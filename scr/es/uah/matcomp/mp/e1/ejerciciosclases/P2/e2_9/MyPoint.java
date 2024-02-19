package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_9;

public class MyPoint {
    private double x;
    private double y;

    ////////////////////////////////////////////////////////////////
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    ////////////////////////////////////////////////////////////////


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double[] getXY() {
        double[] ints = new double[]{x,y};
        return ints;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%s,%s)",x,y);
    }

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public double distance(MyPoint another) {
        double deltaX = this.x - another.x;
        double deltaY = this.y - another.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
}