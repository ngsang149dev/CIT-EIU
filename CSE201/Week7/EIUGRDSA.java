package Week7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class EIUGRDSA {
    static class Student {
        int id;
        int[] scores;
        int totalScore;

        public Student(int id, int numberOfProblem) {
            this.id = id;
            this.scores = new int[numberOfProblem];
        }

        public void addScore(int problemCode, int score) {
            scores[problemCode] = Math.max(scores[problemCode], score);
        }


        public double getGpa() {
            for (int score : scores) {
                totalScore+=score;
            }
            return totalScore / scores.length;
        }

    }

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int numberOfStudent = sc.nextInt();
        int numberOfProblem = sc.nextInt();
        int numberOfSubmission = sc.nextInt();

        int[] studentIds = new int[numberOfStudent];
        HashMap<Integer, Student> studentMap = new HashMap<>();
        for (int i = 0; i < numberOfStudent;i++) {
            studentIds[i] = sc.nextInt();
            studentMap.put(studentIds[i], new Student(studentIds[i], numberOfProblem));
        }

        HashMap<Integer, Integer> problemCodes = new HashMap<>();
        for (int i = 0; i < numberOfProblem;i++) {
            problemCodes.put(sc.nextInt(),i);
        }

        for (int i = 0; i< numberOfSubmission;i++) {
            int studentId = sc.nextInt();
            int problemCode = sc.nextInt();
            int score = sc.nextInt();

            int indexOfProblem = problemCodes.get(problemCode);
            studentMap.get(studentId).addScore(indexOfProblem, score);
        }

        Arrays.sort(studentIds);
        for (int id : studentIds) {
            Student s = studentMap.get(id);
            sb.append(s.id).append(" ").append((int)s.getGpa()).append("\n");
        }

        System.out.println(sb);
    }
}
