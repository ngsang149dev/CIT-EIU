package lab7.p2;

public class Client {
    private ShapeFactory factory;

    public Client(ShapeFactory factory) {
        this.factory = factory;
    }

    public Shape getShape() {
        return this.factory.getShape();
    }

    public void setFactory(ShapeFactory factory) {
        this.factory = factory;
    }

    public ShapeFactory updateShapeFactory(ShapeFactory factory) {
        setFactory(factory);
        return this.factory;
    }
}
