package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_7;

public class MyPoint {
    private int x;
    private int y;

    ////////////////////////////////////////////////////////////////
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    ////////////////////////////////////////////////////////////////


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

    public int[] getXY() {
        int[] ints = new int[]{x,y};
        return ints;
    }

    public String getArrayToString(int[] lista){
        int x = lista[0];
        int y = lista[1];
        return String.format("{%s,%s}",x,y);
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%s,%s)",x,y);
    }

    public double distance(int x, int y) {
        int deltaX = this.x - x;
        int deltaY = this.y - y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public double distance(MyPoint another) {
        int deltaX = this.x - another.x;
        int deltaY = this.y - another.y;
        return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

}