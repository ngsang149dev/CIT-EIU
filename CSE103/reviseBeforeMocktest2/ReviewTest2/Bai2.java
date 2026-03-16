package ReviewTest2;
import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = input(n);
        arr = sort(arr);
        sumArr(arr, m);
        
    }

    public static void sumArr(int[] arr, int m) {
        int count = 0;
        int sum = 0;
        for (int i : arr) {
            if (sum+ i > m) {
                break;
            }
            sum+= i;
            count++;
        }
        System.out.printf("%d %d",count,sum);
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] sort(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                   swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void swap (int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
