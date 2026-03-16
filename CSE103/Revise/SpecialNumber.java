import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        int firstDigit = 0;
        int lastDigit = 0;
        if (n < 100) {
            System.out.println("NO");
        } else {
            lastDigit = (int) (n % 10);
            String s = String.valueOf(n);
            char c = s.charAt(0);
            firstDigit = (int) (c - '0');
            long newNumber =(long) firstDigit * 10 + lastDigit;

        if (n % newNumber == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        }

    }
}
// Done