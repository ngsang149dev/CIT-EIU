package CSE203.lab4.prb4;



public class BallpointPen extends Pen {

    public BallpointPen(String name, Brand brand, double price) {
        super(name, brand, price);
        super.setType(PenType.BALLPOINT);
    }

    public BallpointPen(String name, Brand brand, double price, Discount discount) {
        super(name, brand, price, discount);
        super.setType(PenType.BALLPOINT);
    }

    @Override
    public double getTax() {
        return Tax._8;
    }
    
}
