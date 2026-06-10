package Week9;

import java.util.Random;
import java.util.Scanner;

public class EIUQ {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static Random rd = new Random();
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n;i++) {
            numbers[i] = sc.nextInt();
        }

        quickSort(numbers, 0, numbers.length-1);

        for (int i : numbers) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }


    static void quickSort(int[] numbers, int left, int right) {
        if (left>= right) return;
        int mid = partition(numbers, left, right);
        quickSort(numbers, left, mid-1);
        quickSort(numbers, mid+1, right);
    }

    static int partition(int[] numbers, int left, int right) {
        int pivotIdx = rd.nextInt(left, right);
        swap(numbers, pivotIdx, left);
        int pivot = numbers[left];
        int j = left+1;
        for (int i = left+1;i <=right;i++) {
            if (numbers[i] < pivot || numbers[i] == pivot && rd.nextDouble() < 0.5) {
                swap(numbers, i, j++);
            }
        }
        swap(numbers, left, j-1);
        return j-1;
    }

    static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}