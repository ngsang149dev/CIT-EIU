package CSE203.lab4.prb4;



public class FountainPen extends Pen {

    public FountainPen(String name, Brand brand, double price) {
        super(name, brand, price);
        super.setType(PenType.FOUNTAIN);
    }

    public FountainPen(String name, Brand brand, double price, Discount discount) {
        super(name, brand, price, discount);
        super.setType(PenType.FOUNTAIN);
    }

    @Override
    public double getTax() {
        return Tax._10;
    }   
}
