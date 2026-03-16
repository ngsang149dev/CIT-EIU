package ReviewTest2;
import java.util.*;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();;
        int[] students = new int[n];
        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();
        }
        int idx = maxScore(n);
        System.out.println(students[idx]);

    }

    public static int maxScore(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        double max = arr[0];
        int indexMax = (int) 0;
        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    public static void anotherMethod (int n) {
        int[] arr= new int[n];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        float max = Float.MIN_VALUE;
        int idx = -1;
        for (i = 0; i < arr.length; i++) {
            float t = sc.nextInt();
            if (t > max) {
                max = t;
                idx = i;
            }
        }
        System.out.println(arr[idx]);
    }
}
