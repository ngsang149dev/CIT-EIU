package CSE203.lab5.p5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordFrequency {
    static File file = new File("CSE203/lab5/p5/data.txt");
    static Scanner sc;

    static {
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> wordMap = new HashMap<>();
        while (sc.hasNext()) {
            String word = sc.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (word.isEmpty()) continue;
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }
        List<String> sorted = new ArrayList<>(wordMap.keySet());
        sorted.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        for (String word : sorted) {
            System.out.println(word + " => " + wordMap.get(word));
        }
    }
}
