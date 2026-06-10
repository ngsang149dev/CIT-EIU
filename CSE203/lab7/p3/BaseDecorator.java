package lab7.p3;

public abstract class BaseDecorator extends SimpleCoffee{
    protected Coffee decoratedCoffee;

    public BaseDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
