

import java.util.Scanner;

public class EIORDERS {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String result = "";
        if(checkIncreasing(arr)) {
            result = "increasing";
        }
        else if (checkDecreasing(arr)) {
            result =  "decreasing";
        }
        else {
            result = "none";
        }
        System.out.println(result);
        sc.close();
        
    }

    public static boolean checkIncreasing(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDecreasing(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
