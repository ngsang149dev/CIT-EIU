

import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int)n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLong();
        }
        long minValue = arr[0];
        long maxDistance = 0;
        for (int i = 1; i < arr.length;i++) {
            if (arr[i] - minValue > maxDistance) {
                maxDistance = arr[i] - minValue;
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }  
        System.out.println(maxDistance);   
        sc.close(); 
    }

}
