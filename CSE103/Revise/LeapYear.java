import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 100 == 0) {
            if (n % 400 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if ( n % 4 == 0) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
// Done