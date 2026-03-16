package ReviewFinal;

import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i : arr) {
            if(!checkBeautiful(i) && checkBalance(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean checkBeautiful(int number) {
        while (number != 0) {
                int t = number % 10;
                if (t == 0 || t % 4 == 0) {
                    return true;
                }
                number /= 10;
            }
        return false;
    }

    public static boolean checkBalance(int n) {
        int evenNum = 0;
        int oddNum = 0;
        while (n != 0) {
            int t = n % 10;
            if (t % 2 == 0) {
                evenNum++;
            } else
                oddNum++;
            n /= 10;
        }
        return evenNum == oddNum;
    }

}
