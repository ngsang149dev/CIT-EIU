package lab7.p3;

public class WhippedCreamDecorator extends BaseDecorator {

    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }
    
}
