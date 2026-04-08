import java.util.Scanner;

public class EIDORM {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int rooms = sc.nextInt();
        int result = 0;
        while (rooms >0) {
            int[] roomCondition = new int[2];
            for (int i = 0; i < roomCondition.length;i++) {
                roomCondition[i] = sc.nextInt();
            }
            if (checkRoom(roomCondition)) {
                result++;
            }
            rooms--;
        }
        System.out.println(result);
    }

    static boolean checkRoom(int[] roomCondition) {
        if (roomCondition[1] - roomCondition[0] >= 2) {
            return true;
        }
        return false;
    }
}
// Completed