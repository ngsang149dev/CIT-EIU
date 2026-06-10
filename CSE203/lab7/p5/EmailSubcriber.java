package lab7.p5;

public class EmailSubcriber implements Observer{

    @Override
    public void update(String message) {
        System.out.println("EmaiL Subscriber: %s".formatted(message));
    }

}
