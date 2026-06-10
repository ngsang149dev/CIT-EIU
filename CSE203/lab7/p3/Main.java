package lab7.p3;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.getCost() );
        System.out.println("Description: " + coffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println("Cost: $" + milkCoffee.getCost() );
        System.out.println("Description: " + milkCoffee.getDescription());

    }
}