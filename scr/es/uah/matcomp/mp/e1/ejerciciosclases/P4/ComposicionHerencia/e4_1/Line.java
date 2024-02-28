package es.uah.matcomp.mp.e1.ejerciciosclases.P4.ComposicionHerencia.e4_1;

public class Line {
    private Point begin;
    private Point end;

    //////////////
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    /////////////

    public String toString() {
        return "Line{" + "begin=" + begin + ", end=" + end + "}";
    }


    public Point getBegin() {
        return begin;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }



    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }


    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setX(x);
        this.begin.setY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setEndXY(int x, int y) {
        this.end.setX(x);
        this.end.setY(y);
    }


    public double getLength() {
        int xDiff=getBeginX()-getEndX();
        int yDiff=getBeginY()-getEndY();
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double getGradient(){
        int xDiff=getBeginX()-getEndX();
        int yDiff=getBeginY()-getEndY();
        return Math.atan2(xDiff,yDiff);
    }
}
