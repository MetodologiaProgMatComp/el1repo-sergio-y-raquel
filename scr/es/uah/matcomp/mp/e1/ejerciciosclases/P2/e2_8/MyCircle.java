package es.uah.matcomp.mp.e1.ejerciciosclases.P2.e2_8;

public class MyCircle {
    private MyPoint center;
    private int radius;

    ///////////////////////////////////////////////////////////////////////////
    public MyCircle() {
        this.center = new MyPoint(0,0);
        this.radius = 1;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    //////////////////////////////////////////////////////////////////////////


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX(){
        return this.center.getX();
    }

    public void setCenterX(int x){
        this.center.setX(x);
    }

    public int getCenterY(){
        return this.center.getY();
    }

    public void setCenterY(int y){
        this.center.setY(y);
    }

    public int[] getCenterXY() {
        int x = this.getCenterX();
        int y = this.getCenterY();
        int[] ints = new int[]{x, y};
        return ints;
    }

    public void setCenterXY(int x, int y) {
        this.setCenterX(x);
        this.setCenterY(y);
    }

    public String toString (){
        return String.format("MyCicle[radius=%s, center=%s]",radius,center.toString());
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }
}
