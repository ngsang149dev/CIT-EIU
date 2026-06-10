package lab7.p2;

public class Rectangle implements Shape {
    private double width;
    private double length;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with a length of %s and a width of %s".formatted(this.length, this.width));
    }

}
