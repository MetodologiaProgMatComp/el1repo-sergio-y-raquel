package es.uah.matcomp.mp.e1.ejerciciosclases.P1;

public class Rectangle {
    private float lenght = 1.0f;
    private float width = 1.0f;

    //////////////////
    public Rectangle() {
    }

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }
/////////////////////

    public float getLength() {
        return lenght;
    }

    public void setLength(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return lenght * width;
    }

    public double getPerimeter() {
        return 2 * lenght + 2 * width;
    }

    public String toString() {
        return "Rectangle[length= " + lenght + ", width " + width + "]";
    }
}
