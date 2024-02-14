package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Rectangle {
    float lenght=1.0f;
    float width=1.0f;

    public void rectangle(){
        this.lenght=1.0f;
        this.width=1.0f;
    }

    public void rectangle(float len,float wid){
        this.lenght=len;
        this.width=wid;
    }

    public float getLength() {
        return lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float lenght) {
        this.lenght = lenght;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return lenght*width;
    }
    public double getPerimeter(){
        return 2*lenght+2*width;
    }
    public String toString() {
        return "Rectangle[length= " + lenght +", width "+width+"]";
    }
}
