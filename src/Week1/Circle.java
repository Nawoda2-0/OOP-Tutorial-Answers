package Week1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1;
        color = "blue";
    }
    public Circle(double r){
        radius = r;
        color = "blue";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (Math.PI * radius * radius);
    }

    public static void main(String[] args){
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(7);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());
    }
}
