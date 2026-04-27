package CSE203.lab2.Car;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car(2005, "lamborghini");
        car1.setSpeed(200);
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed Acceleration: ");
            car1.accelerate();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Speed Braking: ");
            car1.brake();
        }
    }
}
