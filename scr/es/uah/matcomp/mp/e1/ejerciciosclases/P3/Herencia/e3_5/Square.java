package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_5;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side){
        this.setSide(side);
    }

    @Override
    public void setLength(double side){
        this.setSide(side);
    }
    @Override
    public String toString(){
        return "Square["+super.toString()+"]";
    }
}

