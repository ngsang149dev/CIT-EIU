import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        String typeOfCustomer = sc.next();
        int time = sc.nextInt();

        if (payment > 200000 && payment <= 500000) {
            if (typeOfCustomer.equals("VVIP")) {
                payment = payment - (payment * 0.03);
            }
            if (typeOfCustomer.equals("VIP")) {
                payment = payment - (payment * 0.02);
            }
        }
        if (payment > 500000 && payment <= 1000000) {
            if (typeOfCustomer.equals("VVIP")) {
                payment = payment - (payment * 0.05);
            }
            if (typeOfCustomer.equals("VIP")) {
                payment = payment - (payment * 0.03);
            }
        }
        if (payment > 1000000) {
            if (typeOfCustomer.equals("VVIP")) {
                payment = payment - (payment * 0.07);
            }
            if (typeOfCustomer.equals("VIP")) {
                payment = payment - (payment * 0.05);
            }
        }
        double afterPayment = payment;

        if (afterPayment >= 700000) {
            if ( time < 12) {
                afterPayment = afterPayment - 50000;
            }
            else if (time <= 19) {
                afterPayment = afterPayment - 30000;
            }
            else {
                afterPayment = afterPayment - 20000;
            }
        }
        System.out.println(afterPayment);
    }
}
