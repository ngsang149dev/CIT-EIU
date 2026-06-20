import java.util.Scanner;

public class PFS_Q1 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        long[] pfs = new long[n];
        for (int i = 0; i < n;i++) {
            long num = sc.nextLong();
            if (i==0) {
                pfs[i] = num;
            } else {
                pfs[i] = pfs[i-1] + num;
            }
        }
        for (int t = 0; t < q;t++) {
            int left = sc.nextInt()-1, right = sc.nextInt()-1;
            long ans;
            if (left ==0) {
                ans = pfs[right];
            } else {
                ans = pfs[right] -pfs[left-1];
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
