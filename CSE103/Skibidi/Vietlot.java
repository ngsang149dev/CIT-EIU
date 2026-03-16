import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vietlot {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    public static void main(String[] args) {
        int[] arr = getTicket();
        Arrays.sort(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

    public static int[] getTicket() {
        int[] arr = new int[0];
        while (arr.length < 5) {
            int number = rd.nextInt(1,45);
            while (isExisted(arr, number)) {
                number = rd.nextInt(1,45);
            }
            arr = insert(arr, number, arr.length);
        }
        return arr;
    }

    public static int[] insert(int[] arr, int number, int idx) {
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < idx;i++) {
            newArr[i] = arr[i];
        }
        newArr[idx] = number;
        for (int i = idx; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

    public static boolean isExisted(int[] arr, int number) {
        for (int i : arr) {
            if (i == number) {
                return true;
            }
        }
        return false    ;
    }
}
