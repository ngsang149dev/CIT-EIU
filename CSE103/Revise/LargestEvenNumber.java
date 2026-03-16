import java.util.Scanner;

public class LargestEvenNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        int max = (n == 0) ? 0 : -1;
        while (n != 0) {
            int t = (int) n % 10;
            if ( t % 2 == 0 && max < t) {
                max = t;
            }
            n/=10;
        }
        System.out.println(max);
    }
}
// Done
