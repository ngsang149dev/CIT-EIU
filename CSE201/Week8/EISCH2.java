package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EISCH2 {

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int t = 0; t < n;t++) {
            String name = sc.next();
            Student student = new Student(name);
            int course = sc.nextInt();
            for (int c = 0; c < course;c++) {
                student.addScore(sc.nextInt());
            }
            students.add(student);
        }

        students.sort((s1, s2) -> {
            var cmp = Double.compare(s2.getGpa(), s1.getGpa());
            if (cmp == 0) {
                cmp = s1.name.compareToIgnoreCase(s2.name);
            }
            return cmp;
        });

        print(students, n);
    }

    static void print(List<Student> students, int n) {
        double removeA = students.get(n/12).getGpa();
        double removeB = students.get(n/3).getGpa();
        double removeC = students.get(n/2).getGpa();

        for (Student s : students) {
            if (s.getGpa() > removeA) {
                System.out.println(s + " A");
            } else if (s.getGpa() > removeB) {
                System.out.println(s + " B");
            } else if (s.getGpa() > removeC) {
                System.out.println(s + " C");
            } else break;
        }
    }

    static class Student {
        String name;
        int totalScore;
        int totalPassed;
        

        public Student(String name) {
            this.name = name;
        }

        public void addScore(int score) {
            if (score >= 50) {
                totalScore+= score;
                totalPassed++;
            }
        }

        public double getGpa() {
            return totalPassed == 0 ? 0 : totalScore / (double)totalPassed;
        }

        @Override
        public String toString() {
            return "%s %s".formatted(this.name, Math.round(this.getGpa() *100)/100d);
        }

        
    }
}