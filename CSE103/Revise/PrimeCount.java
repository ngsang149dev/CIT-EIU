import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            if (i < 2) isPrime = false;
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
            
        }
        System.out.println(count);
    }
}
// Done