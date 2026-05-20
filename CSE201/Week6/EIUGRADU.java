package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class EIUGRADU {

    static class Student {
        int id;
        String name;
        int gpa;
        int totalScore;
        int course;
        int personalCredit;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void addGpa(int score) {
            if (score >= 50) {
                totalScore+= score;
                course++;
                gpa = totalScore / course;
                personalCredit+= 4;
            }
        }

        @Override
        public String toString() {
            return "%s %s %s".formatted(this.id, this.name, this.gpa);
        }
    }

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int record = sc.nextInt();
        int requiredCredit = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < record; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int course = sc.nextInt();
            var student = new Student(id, name);
            for (int t = 0; t < course; t++) {
                int score = sc.nextInt();
                student.addGpa(score);
            }
            students.add(student);
        }    

        students.sort((s1, s2) -> {
            var compare = Integer.compare(s2.gpa, s1.gpa);
            return (compare == 0) ? Integer.compare(s1.id, s2.id) : compare;
        });

        for (Student student : students) {
            if (student.personalCredit >= requiredCredit) {
                sb.append(student).append("\n");
            }
        }
        System.out.println(sb);
    }
}
