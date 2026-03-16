package ReviewFinal;

import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : changeElement(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] changeElement(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0 && arr[i] % 5 == 0) {
                newArr[i] = (arr[i] /2);
            }
            else if ( arr[i] % 2 == 1 && arr[i] % 3 == 0) {
                newArr[i] = arr[i] * 2;
            }
            else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}
