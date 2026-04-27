package CSE203.lab2.Temperature;

public class Application {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(36);

        System.out.println("%.2f".formatted(t1.getFahrenheit()));
        System.out.println("%.2f".formatted(t1.getCelsius()));
        System.out.println("%.2f".formatted(t1.getKelvin()));
    }
    
}
