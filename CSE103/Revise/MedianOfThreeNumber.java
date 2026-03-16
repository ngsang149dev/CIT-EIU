import java.util.Scanner;

public class MedianOfThreeNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a > c){
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }

        System.out.println(b);

    }
}
// Done