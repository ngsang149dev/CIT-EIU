package Problem4;

import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        FuelGauge fg1 = new FuelGauge(5);
        Odometer m1 = new Odometer(fg1);
        
        // while (fg1.getGallon() < Const.CAR_MAX_GALLON) {
        //     fg1.increaseGallon();
        // }

        while (fg1.getGallon() > 0) {
            m1.incrementMileage();
            System.out.println("Mileage: %s \n Fuel: %s".formatted(m1.getMileage(),fg1.getGallon()));
        }
    }
}
