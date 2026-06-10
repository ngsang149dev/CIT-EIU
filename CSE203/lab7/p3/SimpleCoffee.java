package lab7.p3;

public class SimpleCoffee implements Coffee{

    @Override
    public double getCost() {
        return 36;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
