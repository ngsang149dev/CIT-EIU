package ReviewTest2;
import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = input(n);
        countNumber(arr, n);
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void countNumber (int[] arr, int n) {
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg+=arr[i];
        }
        double result = (double) avg / n;
        int count = 0;
        for (int i : arr) {
            if (i > result) {
                count++;
            }
        }
        System.out.println(count);
    }
}
