package CSE203.lab5.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Word {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] words = input.split(" ");
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            wordSet.add(words[i]);
        }
        List<String> sorted = new ArrayList<>(wordSet);
        Collections.sort(sorted);

        System.out.println(sorted);
    }
}
