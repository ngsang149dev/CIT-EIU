package Week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EISTULI {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Student> students = new ArrayList<>();
        while (n > 0) {
            int id = sc.nextInt();
            String name = sc.next();
            int course = sc.nextInt();
            Student student = new Student(id, name);
            for (int c = 0; c < course;c++) {
                student.addScore(sc.nextInt());
            }
            students.add(student);
            n--;
        }
        students.sort((s1, s2) -> {
            return Double.compare(s2.getGpa(), s1.getGpa());
        });

        double standard = k < students.size() ? students.get(k).getGpa() : Double.MIN_VALUE;
        for (int i = 0; i < students.size();i++) {
            Student s = students.get(i);
            if (s.getGpa() > standard) {
                sb.append(s).append("\n");
            } else break;
        }
        System.out.println(sb);
    }

    static class Student {
        int id;
        String name;
        int totalScore;
        int totalPassed;
        int credit;
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void addScore(int score) {
            if (score >= 50) {
                totalScore+= score;
                totalPassed++;
                credit+= 4;
            }
        }

        public double getGpa() {
            return totalPassed == 0 ? 0 : totalScore / (double)totalPassed;
        }

        @Override
        public String toString() {
            return "%s %s %s %s".formatted(this.id, this.name, Math.round(this.getGpa()), this.credit);
        }

        
    }
}