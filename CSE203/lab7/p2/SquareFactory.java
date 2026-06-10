package lab7.p2;

public class SquareFactory implements ShapeFactory {
    private double side;
    public SquareFactory(double side) {
        this.side = side;
    }
    @Override
    public Shape getShape() {
        return new Square(this.side);
    }
}
