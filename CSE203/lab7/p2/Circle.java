package lab7.p2;

public class Circle implements Shape {
    private double diameter;
    public Circle(double diameter) {
        this.diameter = diameter;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with a diameter of: "+ diameter);
    }

    
}
