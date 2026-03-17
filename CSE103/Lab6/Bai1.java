
import java.util.Scanner;


public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = input();
        int x = sc.nextInt();
        int value = sc.nextInt();
        arr = insertX(arr, x, value);
        output(arr);
    }

    public static int[] input() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void output(int[] arr) { 
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }

    public static int[] deleteEle(int[] arr, int k) {
        if (arr.length == 0 || k < 0 || k >= arr.length) {
            return arr;
        }
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < k; i++) {
            newArr[i] = arr[i];
        }
        int newLength = arr.length-1;
        for (int i = k; i < newLength; i++) {
            newArr[i] = arr[i+1];
        }
        return newArr;
        
    }

    public static int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] deleteEleX(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == x ) {
                arr = deleteEle(arr, i);
                i--;
            }
        }
        return arr;
    }

    public static int[] insertX(int[] arr, int idx, int value) {
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i<idx;i++) {
            newArr[i] = arr[i];
        }
        newArr[idx] = value;
        for(int i = idx; i<arr.length;i++ ){
            newArr[i+1] = arr[i];
        }
        return newArr;
        
        
    }

    // public static int[] descendingArr(int[] arr) {
        
    // }

}
