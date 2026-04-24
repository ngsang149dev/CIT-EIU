package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EISW2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n;i++){
            int number = sc.nextInt();
            list.add(number);
        }

        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum+= list.get(i);
        } // gain sum of the first window
        double maxAvg = windowSum / k;
        for (int i = k; i < n;i++) { //Start sliding the window
            windowSum+= list.get(i) - list.get(i-k);  //Important: list[i] - list[i-k] is to get sum of window
            maxAvg = Math.max(maxAvg, windowSum / k);
        }
        
        double roundedResult = Math.round(maxAvg * 100.0) / 100.0;
        System.out.println(roundedResult);
    }
}

// Uncompleted
