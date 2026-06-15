package lab6.p1;

public class Rectangle implements Shape{
    private double length;
    private double width;   

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");  
        System.out.println("Area: " + calculateArea());  
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    
}
