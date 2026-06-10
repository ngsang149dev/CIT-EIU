package lab7.p2;

public class RectangleFactory implements ShapeFactory {
    private double length;
    private double width;

    public RectangleFactory(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public Shape getShape() {
        return new Rectangle(this.length, this.width);
    }
}
