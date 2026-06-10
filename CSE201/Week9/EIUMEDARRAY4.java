package Week9;

import java.util.Random;
import java.util.Scanner;
public class EIUMEDARRAY4 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static Random rd = new Random();
    public static void main(String[] args) {
        short testcase = sc.nextShort();
        while (testcase --> 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            long P = sc.nextLong();
            int K = sc.nextInt();

            long[] arr = new long[N];
            arr[0] = ((long)A*A) % P;
            for (int i = 1; i < N;i++) {
                arr[i] = (arr[i-1] * A) % P;
            }

            sb.append(ithElement(arr, K-1)).append("\n");
        }
        System.out.println(sb);
    }

    static long ithElement(long[] numbers, int k ) {
        quickSearch(numbers, 0, numbers.length-1, k);
        return numbers[k];
    }

    static void quickSearch(long[] numbers, int left, int right, int k) {
        if (left >= right) return;

        int pivotIndex = partition(numbers, left, right);

        if (pivotIndex == k) {
            return;
        } else if (pivotIndex > k) {
            quickSearch(numbers, left, pivotIndex-1, k);
        } else {
            quickSearch(numbers, pivotIndex+1, right, k);
        }
    }

    static int partition(long[] numbers, int left, int right) {
        int pivotIdx = rd.nextInt(left, right);
        swap(numbers, pivotIdx, left);
        long pivot = numbers[left];
        int j = left+1;
        for (int i = left+1;i <=right;i++) {
            if (numbers[i] < pivot || numbers[i] == pivot && rd.nextDouble() < 0.5 ) {
                swap(numbers, i, j++);
            }
        }
        swap(numbers, left, j-1);
        return j-1;
    }

    static void swap(long[] numbers, int a, int b) {
        long temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
