import java.util.Scanner;

public class TheFirstFibonacci {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        printFirstFibonacci(n);
    }
    
    public static void printFirstFibonacci(long n) {
        for (int i = 0; i<n; i++) {
            System.out.print(firstFibonacci(i)+ " ");
        }
    }

    // muốn dùng hàm đệ quy bắt buộc phải có vòng lặp lấy tham sô i ở hàm trên
    public static long firstFibonacci(long n) {
        if (n <= 1 ) return n; 
        return firstFibonacci(n-1) + firstFibonacci(n-2);
    }

    public static void findFirstFibonacciV2(long n) {
        long f0 = 0, f1 = 1;
        for (int i = 0; i< n; i++) {
            System.out.print(f0+ " ");
            long t = f0 + f1;
            f0 = f1;
            f1 = t;
        } 
    }
}
// Done