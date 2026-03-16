import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteElement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = input(n);
        // int idx = sc.nextInt();
        int value = sc.nextInt();
        arr = deleteMultiIndex(arr, value);
        output(arr);
    }

    public static int[] input(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void output(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] deleteEachElement(int[] arr, int idx) {
        if (idx > arr.length || arr.length == 0 || idx < 0) {
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < idx; i++) {
            newArr[i] = arr[i];
        }
        for (int i = idx; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    public static int[] deleteEachElementV2(int[] arr, int idx) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        list.remove(idx);
        int[] newArr = list.stream().mapToInt(Integer::intValue).toArray();
        return newArr;
    }

    public static int[] deleteMultiIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                arr = deleteEachElementV2(arr, i);
                i--;
            }
        }
        return arr;
    }
}
