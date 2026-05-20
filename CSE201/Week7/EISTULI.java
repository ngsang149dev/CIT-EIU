package Week7;

import java.util.ArrayList;
import java.util.Scanner;

public class EISTULI {
    static class Student {
        int id;
        String name;
        double totalScore;
        int passedCourses;
        int totalCredit;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        } 

        public void addScore(int score) {
            if (score >= 50) {
                totalScore+= score;
                totalCredit+=4;
                passedCourses++;
            }
        }

        public double getGpa() {
            if (passedCourses == 0) {
                return 0.0;
            }
            return totalScore / passedCourses;
        }

        @Override
        public String toString() {
            return "%s %s %s %s".formatted(this.id, this.name, Math.round(getGpa()), this.totalCredit);
        }
    }
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int numberOfRecord = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        for (int t =0; t< numberOfRecord;t++) {
            int id = sc.nextInt();
            String name = sc.next();
            int courses = sc.nextInt();
            var student = new Student(id, name);
            for (int i = 0; i < courses;i++) {
                student.addScore(sc.nextInt());
            }
            students.add(student);
        }

        students.sort((s1, s2) -> {
            return Double.compare(s2.getGpa(), s1.getGpa());
        });
        
        double pivot =  (k < students.size()) ? students.get(k).getGpa() : -1;

        for (int i = 0; i < students.size();i++) {
            if (students.get(i).getGpa() > pivot) {
                sb.append(students.get(i)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
