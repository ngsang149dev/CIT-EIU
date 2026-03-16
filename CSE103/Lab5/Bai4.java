package Lab5;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     System.out.print(recursionF(i)+ " ");
        // }
        printFirstFibonacci(n);
    }
    //Recursion is not allowed!!!!
    public static int recursionF(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return recursionF(n -1) + recursionF(n -2);
    }

    public static void printFirstFibonacci(int n) {
        BigInteger f0 = BigInteger.ONE, f1 = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            System.out.println(f1);
            if ( i < 1 ) {
                continue;
            }
            BigInteger t = f0;
            f0 = f1;
            f1 = f1.add(t);

        }
        
    }
}
 