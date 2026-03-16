

import java.util.Arrays;
import java.util.Scanner;

public class EITRIGLE {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countTriangle(arr));
        sc.close();

    }

    public static int countTriangle(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (isTriangle(arr[i], arr[j], arr[k])) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isTriangle(int a, int b, int c) {

        return a + b > c;    
    }
}