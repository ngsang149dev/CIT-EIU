package lab6.p1;

public class Square implements Shape{
    private double edge;
    
    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square"); 
        System.out.println("Area: " + calculateArea());
    }
    @Override
    public double calculateArea() {
        return edge * edge;
    }
    
}
