import java.util.Scanner;

public class PalindromicNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean result = isPalindromicNumber(n);
        if(result) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean isPalindromicNumber(long n) {
        String s = String.valueOf(n);
        var sb = new StringBuilder(s);
        sb.reverse();
        String reverse = sb.toString();
        if (s.equals(reverse)) {
            return true;
        }
        else return false;
    }
}
// Done