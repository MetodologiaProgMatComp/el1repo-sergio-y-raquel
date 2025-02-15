package es.uah.matcomp.mp.e1.ejerciciosclases.P2.ComposicionAgregacion.e2_7;

public class MyLine {
    private MyPoint begin = new MyPoint();
    private MyPoint end = new MyPoint();

    /////////////////////////////////////////////////////////////////////
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    //////////////////////////////////////////////////////////////////

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        int x = this.getBeginX();
        int y = this.getBeginY();
        int[] ints = new int[]{x, y};
        return ints;
    }

    public String getArrayToString(int[] lista){
        int x = lista[0];
        int y = lista[1];
        return String.format("{%s,%s}",x,y);
    }

    public void setBeginXY(int x, int y) {
        this.setBeginX(x);
        this.setBeginY(y);
    }

    public int[] getEndXY() {
        int x = this.getEndX();
        int y = this.getEndY();
        int[] ints = new int[]{x, y};
        return ints;
    }

    public void setEndXY(int x, int y) {
        this.setEndX(x);
        this.setEndY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int deltaX = this.getBeginX() - this.getEndX();
        int deltaY = this.getBeginY() - this.getEndY();
        return Math.atan2(deltaY, deltaX);
    }

    public String toString() {
        int x1 = this.getBeginX();
        int y1 = this.getBeginY();
        int x2 = this.getEndX();
        int y2 = this.getEndY();
        return String.format("MyLine[begin=(%s,%s), end(%s,%s)]", x1, y1, x2, y2);
    }

}
