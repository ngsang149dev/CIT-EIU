
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactors(n);
    }
    public static void printPrimeFactors(int n) {
        
        int i = 2;
        while (i<= Math.sqrt(n)) {
            int count = 0;
            while (n% i ==0) {
                count++;
                n/=i;
            }
            if (count > 0) {
                System.out.printf("%d  %d\n",i,count);
            }
            i++;
        }
        if (n>1){
            System.out.println(n+ " 1");
        }
    }
}
// Done