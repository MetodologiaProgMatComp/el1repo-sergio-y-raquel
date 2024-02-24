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


    @Override
    public String toString() {
        return "LineSub{begin= " + "end=" + end + '}';
    }
}
