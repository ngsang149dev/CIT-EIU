package ReviewTest2;
import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = input(n);
        countStrongNumber(arr);
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static boolean checkZero(int n) {
        while (n != 0) {
            int t = n % 10;
            if (t == 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i* i <= n; i++) {
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void countStrongNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if(!checkZero(i)) {
                int sum = 0; 
                int num = i;
                while (num!=0) {    
                    sum+=num% 10;
                    num/=10;
                }
                if(isPrime(sum)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isStrongNumber (int n) {
        int sum = 0;
        while (n !=0) {
            int t = n % 10;
            if ( t == 0) {
                return false;
            }
            sum+=t;
            n/=10;
        }
        return isPrime(sum);

    }
}
