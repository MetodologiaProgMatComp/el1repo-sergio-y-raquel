package es.uah.matcomp.mp.e1.ejerciciosclases.P3.Herencia.e3_4;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString(){
        return super.toString()+", speed= ("+xSpeed+", "+ySpeed+")";
    }

    public MovablePoint move(){
        this.setX(getX()+xSpeed);
        this.setY(getY()+ySpeed);
        return this;
    }

}
