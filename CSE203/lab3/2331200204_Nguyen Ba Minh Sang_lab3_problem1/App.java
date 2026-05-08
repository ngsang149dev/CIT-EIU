import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        RetailItem MacBook = new RetailItem("MacBook Pro M5", 40, 599);
        CashRegister cash1 = new CashRegister(MacBook, 36);
        System.out.println(cash1.getTotal());

    }
}
