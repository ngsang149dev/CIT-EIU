import java.util.Scanner;

public class DecendingNumber {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean isDescending = true;
        long i = 0;
        long j = 0;
        while (n > 10) {
            i = n % 10;
            j = (n /10) % 10;
            if ( j < i ) {
                isDescending = false;
                break;
            }
            n/=10;
        }
        if(isDescending) System.out.println("YES");
        else System.out.println("NO");
        
    }
}
// Done