import java.util.Scanner;

public class PrimeDivisor {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == -1 || n == 1) {
            System.out.println(0);
        } else {
            n = Math.abs(n);
            int result = isPrimeNumber(n);
        System.out.println(result);
        }
        
    }

    public static int isPrimeNumber(int n) {
        int i = 2;
        int count = 0;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
            i++;
        }
        if (n > 1) {
            count++;
        }
        return count;
    }
}
// Done