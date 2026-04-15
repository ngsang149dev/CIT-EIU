import java.util.Scanner;

public class  EIUPH014 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        while (n != 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            boolean found = false;

            for (int step = 0; step <= 1000;step++) {
                if (checkEqual(arr)) {
                    count = step;
                    found = true;
                    break;
                }
                int[] tempArr = new int[n];
                for (int i = 0; i < n-1;i++) {
                    tempArr[i] = Math.abs(arr[i] - arr[i+1]);
                }
                tempArr[n-1] = Math.abs(arr[n-1] - arr[0]);
                arr = tempArr;
            }
            System.out.println(found ? count : -1);
            n = sc.nextInt();
        }
    }

    static boolean checkEqual(int[] arr) {
        for (int i = 1; i < arr.length;i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
// Completed
