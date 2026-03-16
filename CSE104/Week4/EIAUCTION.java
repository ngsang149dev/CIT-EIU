package Week4;

import java.util.Scanner;

class EIAUCTION {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] participants = new int[n];
        for (int i = 0; i < participants.length;i++) {
            participants[i] = sc.nextInt();
        }
        int[] count = new int[7];
        int[] index = new int[7];
        for (int i = 0; i < participants.length; i++) {
            int roll = participants[i];
            count[roll]++;
            index[roll] = i+1;
        }
        
        for (int i = 6; i >= 1; i--) {
            if(count[i] == 1) {
                System.out.println(index[i]);
                return;
            }

        }
        System.out.println("none");

    }    
}
// Submitted
