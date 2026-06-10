package lab7.p2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleFactory36 = new CircleFactory(36);
        Client circleClient = new Client(circleFactory36);
        Shape circle = circleClient.getShape();
        circle.draw();

        ShapeFactory circleFactory18 = new CircleFactory(18);
        circleClient.updateShapeFactory(circleFactory18).getShape().draw();

        ShapeFactory squareFactory5 = new SquareFactory(5);
        ShapeFactory squareFactory9 = new SquareFactory(9);
        Client squareClient = new Client(squareFactory5);
        squareClient.getShape().draw();

        squareClient
            .updateShapeFactory(squareFactory9)
            .getShape()
            .draw();

        ShapeFactory RectangleFactory2510 = new RectangleFactory(25, 10);
        squareClient.updateShapeFactory(RectangleFactory2510).getShape().draw();;
    }
}
