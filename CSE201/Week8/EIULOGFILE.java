package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EIULOGFILE {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    static final long STANDARD = 600_000;
    public static void main(String[] args) {
        int numberOfLogfile = sc.nextInt();
        List<Long> logFiles = new ArrayList<>();
        for (int i = 0; i < numberOfLogfile;i++) {
            logFiles.add(sc.nextLong());
        }
        logFiles.sort((a, b) -> Long.compare(a, b));
        long count = 0;
        int left = 0;
        for (int i = 1; i < numberOfLogfile;i++) {
            while (logFiles.get(i) - logFiles.get(left) > STANDARD) {
                left++;
            }
            count+= i - left;
        }
        System.out.println(count);
    }
}
