

import java.util.Scanner;

public class EIEVERYN {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        var sb = new StringBuilder();
        for (int i = 1; i <= testcase; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] mainArr = new int[m];
            for (int j = 0; j < mainArr.length; j++) {
                mainArr[j] = sc.nextInt();
            }
            boolean[] arr = new boolean[n + 1];
            boolean isContinuous = true;
            for (int j = 0; j < mainArr.length; j++) {
                int temp = mainArr[j];
                if (temp > 0 && temp <= n) {
                    arr[temp] = true;
                }
            }
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == false) {
                    isContinuous = false;
                    break;
                }
            }
            if (isContinuous)
                sb.append("Yes\n");
            else
                sb.append("No\n");
        }
        System.out.println(sb.toString());
    }
}