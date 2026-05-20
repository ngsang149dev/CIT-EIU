package Week6;

import java.util.Scanner;

public class EICREDIT {
    static class Student {
        String name;
        int totalCredit;
        public Student(String name) {
            this.name = name;
        }

        public void addScore(int score) {
            if (score >= 50) {
                totalCredit+=4;
            }
        } 

        public int getTotalCredit() {
            return totalCredit;
        }

    }

    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int numberOfRecord = sc.nextInt();
        Student[] students = new Student[numberOfRecord];
        for (int t = 0; t < numberOfRecord; t++) {
            String name = sc.next();
            int course = sc.nextInt();
            var student = new Student(name);
            for (int i = 0; i < course;i++) {
                student.addScore(sc.nextInt());
            }
            students[t] = student;
        }

        for (Student student : students) {
            sb.append(student.name).append(" ").append(student.getTotalCredit()).append("\n");
        }  
        System.out.println(sb);
    }
}
