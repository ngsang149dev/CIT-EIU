import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        System.out.println(gcdV2(a, b));
        System.out.println(gcdV3(a, b));
        System.out.println(lcm(a, b));

    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Giải thích đệ quy hàm gcd
    public static int gcdV2(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcdV3(int a, int b) {
        int max = a;
        if (max < b) {
            max = b;
        }
        int min = a;
        if (min > b) {
            min = b;
        }
        int findGCD = 0;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                findGCD = i;
            }
        }
        return findGCD;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
// Done