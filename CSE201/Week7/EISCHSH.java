package Week7;

import java.util.ArrayList;
import java.util.Scanner;

public class EISCHSH {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static class Student {
        int id;
        String name;
        double totalScore;
        int totalPassedCourse;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void addScore(int score) {
            if (score >= 50) {
                totalScore += score;
                totalPassedCourse++;
            }
        }

        public double getGpa() {
            if (totalPassedCourse == 0) {
                return 0.0;
            }
            return totalScore / totalPassedCourse;
        }

        @Override
        public String toString() {
            return "%s %s %s".formatted(this.id, this.name, Math.round(getGpa()));
        }
    }

    public static void main(String[] args) {
        long numberOfRecord = sc.nextLong();
        int k = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (long t =0; t < numberOfRecord;t++) {
            Student student = new Student(sc.nextInt(), sc.next());
            int course = sc.nextInt();
            for (int i = 0; i < course;i++) {
                student.addScore(sc.nextInt());
            }
            students.add(student);
        }

        students.sort((s1, s2) -> {var cmp = Double.compare(s2.getGpa(), s1.getGpa()); if (cmp == 0) { cmp = Integer.compare(s1.id, s2.id);} return cmp; });

        int rank = 1;
        for (int i = 0; i < students.size();i++) {
            if (i > 0 && students.get(i).getGpa() < students.get(i-1).getGpa()) {
                rank = i+1;
            }
            if (rank > k) break;
            sb.append(rank).append(" ").append(students.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
