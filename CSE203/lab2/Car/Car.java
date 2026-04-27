package CSE203.lab2.Car;

public class Car {

    private int yearModel;
    private String make;
    private int speed;

    public Car() {

    }

    public Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerate() {
        this.speed+= 5;
        System.out.println(this.speed);
        return this.speed;  
    }

    public int brake() {
        this.speed-=5;
        System.out.println(this.speed);
        return this.speed;
    }

    public String toString() {
        return "Speed: %s".formatted(this.speed);
    }
}