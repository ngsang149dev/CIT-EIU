package Week9;

import java.util.Scanner;

public class EIAPPLEBOX {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static int[] temp;
    static long inverseCount;
    public static void main(String[] args) {
        int testcase = sc.nextInt();
        for (int t = 0; t < testcase;t++) {
            int N = sc.nextInt();
            long A = sc.nextLong();
            long P = sc.nextLong();
            int[] arr = new int[N];
            arr[0] = (int) ((A * A) % P);
            for (int i =1; i < N;i++) {
                arr[i] = (int) ((arr[i-1] * A) % P);
            }

            temp = new int[N];
            inverseCount = 0;
            mergeSort(arr, 0, N);
            sb.append(inverseCount).append("\n");
        }
        System.out.println(sb);
    } 
    
    

    static void mergeSort(int[] numbers, int left, int right) {
        if (right - left <= 1) return;
        int mid = left + (right - left) / 2;
        mergeSort(numbers, left, mid);
        mergeSort(numbers, mid, right);
        merge(numbers, left, mid, right);
    }

    static void merge(int[] numbers, int left, int mid, int right) {
        int i = left, j = mid, k = left;
        while (i < mid && j < right) {
            if (numbers[i] <= numbers[j]) temp[k++] = numbers[i++];
            else {
                inverseCount += mid - i;
                temp[k++] = numbers[j++];
            }
        }
        while (i < mid) temp[k++] = numbers[i++];
        while (j < right) temp[k++] = numbers[j++];
        for (int t = left; t < right; t++) numbers[t] = temp[t];
    }
}
