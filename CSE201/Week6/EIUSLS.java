package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class EIUSLS {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static class Student {
        String name;
        int course;
        int gpa;
        int totalScore;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public void addScore(int score) {
            totalScore+= score;
        }

        public double getGpa() {
            return (double)totalScore / course;
        }
    }
    public static void main(String[] args) {
        int numberOfStudent = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < numberOfStudent;i++) {
            String name = sc.next();
            int course = sc.nextInt();
            Student student = new Student(name, course);
            for (int s = 0; s < course;s++) {
                int score = sc.nextInt();
                student.addScore(score);
            }
            students.add(student);
        }

        students.sort((s1, s2) -> {
            return Double.compare(s2.getGpa(), s1.getGpa());
        });

        if (students.size() == 1) {
            sb.append(students.get(0).name);
        } else {
            for (int i = 0; i < 2;i++) {
                sb.append(students.get(i).name).append("\n");
            }
        }
        System.out.println(sb);
    }
}
