import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i<= b; i++) {
            if(isSuperPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
        printSuperPrime(a, b);
    
    }

    public static void printSuperPrime(int a, int b) {
        for (int i = a; i<= b; i++) {
            if(isSuperPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isSuperPrime(int i) {
        if(!isPrime(i)) return false;
        int sum = 0;
        while (i> 0) {
            int t = i % 10;
            sum += t * t;
            i/=10;
        }
        if(!isPrime(sum)) {
            return false;
        }
        return true;
        

    }

    public static boolean isPrime(int i) {
        for (int j = 2; j<= Math.sqrt(i);j++) {
            if (i % j == 0) {
            return  false;
            }
        }
        return true;
    }

    
}
