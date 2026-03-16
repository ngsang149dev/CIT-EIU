import java.math.BigInteger;
import java.util.Scanner;

public class PowerMod {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        BigInteger n = sc.nextBigInteger();
        BigInteger k = sc.nextBigInteger();

        BigInteger result = x.modPow(n, k);
        System.out.println(result);

    }
}
// Done
