package lab6.p1;

public class Circle implements Shape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle"); 
        System.out.println("Area: " + calculateArea());
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
