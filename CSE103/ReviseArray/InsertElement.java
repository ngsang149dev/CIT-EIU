import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertElement {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = input(n);
        int idx = sc.nextInt();
        int value = sc.nextInt();
        arr = insertValueV2(arr, idx, value);
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

    public static int[] insertValue(int[] arr, int idx, int value) {
        int[] newArr = new int[arr.length+1];
        for(int i = 0; i < idx; i++) {
            newArr[i] = arr[i];
        }
        newArr[idx] = value;
        for(int i = idx; i< arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertValueV2(int[] arr, int idx,int value) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        list.add(idx, value);
        int[] newArr = list.stream().mapToInt(Integer::intValue).toArray();
        // or 
        // int[] newArr = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     newArr[i] = list.get(i);
        // }
        return newArr;
    }
}
