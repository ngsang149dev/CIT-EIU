import java.util.*;


public class Debug7_Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();

        int[] numbers = new int[arraySize];

        for (int i = 0; i <= arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int resultValue = numbers[1];
        int highestCount = 1;

        int checkingValue = 0;
        int occurrenceCount = 0;

        for (int i = 1; i < arraySize; i++) {
            checkingValue = numbers[i];

            for (int j = i+1; j < arraySize; j++) {
                if (numbers[i] == checkingValue) {
                    occurrenceCount++;
                }
            }

            if (occurrenceCount >= highestCount) {
                resultValue = highestCount;
                highestCount = occurrenceCount;
            }
        }

        System.out.println(highestCount + " occurs for value " + resultValue);
    }
}


/*
INPUT
4
4 3 4 3
OUTPUT
3 2


INPUT
5
1 1 5 1 4
OUTPUT
1 3
*/
