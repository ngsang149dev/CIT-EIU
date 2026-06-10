package Week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EIUMERSORT {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n;i++) {
            numbers.add(sc.nextInt());
        }
        mergeSort(numbers, 0, numbers.size());
        for (int i = 0; i < n;i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }

    static void mergeSort(List<Integer> numbers,int left,int right) {
        if (right - left <= 1) return;
        int mid = left + (right - left) / 2;
        mergeSort(numbers, left, mid);
        mergeSort(numbers, mid, right);
        merge(numbers, left, mid, right);
    }
    static List<Integer> temp = new ArrayList<>();
    static void merge(List<Integer> numbers, int left, int mid, int right) {
        int i = left, j = mid;
        while (i < mid && j < right) {
            if (numbers.get(i) < numbers.get(j)) {
                temp.add(numbers.get(i));
                i++;
            } else {
                temp.add(numbers.get(j));
                j++;
            }
        }
        while (i < mid) {
            temp.add(numbers.get(i));
            i++;
        }
        while (j < right) {
            temp.add(numbers.get(j));
            j++;
        }
        for (int k = 0; k < temp.size();k++) {
            numbers.set(left + k, temp.get(k));
        }
    }
    

}
