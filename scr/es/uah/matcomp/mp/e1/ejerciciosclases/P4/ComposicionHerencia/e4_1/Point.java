package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

public class Point {
    private int x;
    private int y;

    /////////////
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    ////////////

    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
