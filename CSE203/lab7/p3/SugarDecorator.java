package lab7.p3;

public class SugarDecorator extends BaseDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }
    
}
