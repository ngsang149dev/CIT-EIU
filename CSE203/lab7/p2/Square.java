package lab7.p2;

public class Square implements Shape{
    private double side;
    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with a side of: " + side);
    }

}
