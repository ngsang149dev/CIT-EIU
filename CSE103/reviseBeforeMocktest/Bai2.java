import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i<= b; i++) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i = a; i<= b; i++) {
            
            if(isPrime(i)) {
                System.out.print("Prime"+ " ");
            } else if (i % 5 == 0 || i % 3 == 0) {
                divisibleBy3and5(i);
            }
            else {
                System.out.print(i+ " ");
            }
            
            
        }
    }

    public static boolean isPrime(int i) {
        if ( i < 2) return false;
        for (int j = 2; j<= Math.sqrt(i);j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void divisibleBy3and5(int i) {
        if ( i % 3 == 0 && i % 5 == 0 ) {
            System.out.print("Yahoo"+ " ");
        }
        else if (i % 3 == 0 ) {
            System.out.print("Yaa"+ " ");
        }
        else if (i % 5 == 0) {
            System.out.print("Hoo"+ " ");
        }
        
        
    }
}
