package lab7.p2;

public class CircleFactory  implements ShapeFactory{
    private double diameter;
    public CircleFactory(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public Circle getShape() {
        return new Circle(this.diameter);
    }
}
