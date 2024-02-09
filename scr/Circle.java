/***
 * The Circle Class models a circle with a radius and color
 */

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructores

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius=r;
        color="green";
    }
    public Circle(double r, String c){
        radius=r;
        color=c;
    }

    //Getters

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public String getColor(){
        return color;
    }

    //Setters

    public void setRadius(double newRadius){
        radius=newRadius;
    }
    public void setColor (String newColor){
        color=newColor;
    }
}
