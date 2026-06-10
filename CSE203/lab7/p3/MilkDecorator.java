package lab7.p3;

public class MilkDecorator extends BaseDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 18;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }
}
