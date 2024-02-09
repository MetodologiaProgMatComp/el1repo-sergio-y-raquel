public class TestCircle {
    public static void main(String[] args){
        Circle c1=new Circle ();
        System.out.println("The circle has a radius of "+c1.getRadius()+" and area of "+c1.getArea()+ " and is "+c1.getColor());

        Circle c2=new Circle(2.0);
        System.out.println("The circle has a radius of "+c2.getRadius()+" and area of "+c2.getArea()+ " and is "+c2.getColor());

        Circle c3=new Circle(2.3,"orange");
        System.out.println("The circle has a radius of "+c3.getRadius()+" and area of "+c3.getArea()+ " and is "+c3.getColor());
    }
}
