package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_3;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    //////////////////
    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //////////////////

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public String getArrayToString(float[] lista){
        float x = lista[0];
        float y = lista[1];
        return String.format("{%s,%s}",x,y);
    }

    public float[] getXY(){
        return new float[]{x,y};
    }

    public String toString(){
        return "("+x+","+y+")";
    }
}
