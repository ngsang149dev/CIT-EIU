import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Shape s1 = new Circle(36);
        System.out.println(s1.area());
    }
}
