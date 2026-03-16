package ReviewFinal;

import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        if (isSuperVip(n)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean isConCat(int n) {
        if (n == 0) {
            return false;
        }
        else {
            int finalDigit = n %10;
            while (n !=0) {
                int t = n % 10;
                if (t == finalDigit) {
                    return true;
                }
                n/=10;
            }
        }
        return false;
    }

    public static boolean isSuperVip(int n) {

        while (n != 0) {
            int t = n % 10;
            if (isConCat(t) && t % 3 == 0) {
                return true;
            }
            n/=10;
        }
        return false;
    }
}
