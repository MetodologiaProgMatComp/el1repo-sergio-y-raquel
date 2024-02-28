package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

public class LineSub extends Point {
    Point end;

    ////////////////
    public LineSub(int beginX, int beginY, Point end) {
        super(beginX, beginY);
        this.end = end;
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end=end;
    }
    /////////////////

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public void setBegin(int x, int y) {
        super.setXY(x, y);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point p) {
        this.end = p;
    }


    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int y) {
        super.setY(y);
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

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public void setEndXY(Point end) {
        this.end = end;
    }


    public double getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getBeginY() - getEndY();
        return Math.atan2(xDiff, yDiff);
    }

    @Override
    public String toString() {
        return "LineSub{begin= " + "end=" + end + '}';
    }
}
