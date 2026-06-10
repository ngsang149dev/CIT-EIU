package Week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EIUGRDSA2 {
    static class Student {
        long id;
        int[] scores;
        int totalScore;
        int totalSubmissions;

        public Student(long id, int numberOfProblem) {
            this.id = id;
            this.scores = new int[numberOfProblem];
        }

        public void addScore(int problemCode, int score) {
            scores[problemCode] = Math.max(scores[problemCode], score);
            totalSubmissions++;
        }

        public long getGpa() {
            long totalScore = 0;
            for (int score : scores) {
                totalScore += score;
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
        
        long[] studentIds = new long[numberOfStudent];
        HashMap<Long, Student> studentIdsMap = new HashMap<>();
        for (int i = 0; i < numberOfStudent;i++) {
            studentIds[i] = sc.nextInt();
            studentIdsMap.put(studentIds[i], new Student(studentIds[i], numberOfProblem));
        }

        HashMap<Integer, Integer> problemCodes = new HashMap<>();
        for (int i = 0; i < numberOfProblem;i++) {
            problemCodes.put(sc.nextInt(), i);
        }

        for (int i = 0; i < numberOfSubmission;i++) {
            long studentId = sc.nextLong();
            int problemCode = sc.nextInt();
            int score = sc.nextInt();

            Integer indexOfProblem = problemCodes.get(problemCode);
            if (studentIdsMap.containsKey(studentId) && indexOfProblem != null) {
                studentIdsMap.get(studentId).addScore(indexOfProblem, score);
            }
            
        }

        List<Student> students = new ArrayList<>(studentIdsMap.values());
        students.sort((s1, s2) -> {
            int compare = Double.compare(s2.getGpa(), s1.getGpa());
            if (compare == 0 ) {
                compare = Integer.compare(s1.totalSubmissions, s2.totalSubmissions);
                if (compare == 0) {
                    compare = Long.compare(s1.id, s2.id);
                }
            }
            return compare;
        });

        for (Student student : students) {
            sb.append(student.id)
            .append(" ").append((int)student.getGpa())
            .append(" ").append(student.totalSubmissions)
            .append("\n");
        }
        System.out.println(sb);
    }
}