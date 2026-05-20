package Week7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class EITASKDIS {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static class Person {
        int id;
        int workload;

        public Person(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Person> personQueue = new PriorityQueue<>((p1, p2) -> {
            var compare = Integer.compare(p1.workload, p2.workload);
            if (compare == 0) {
                compare = Integer.compare(p1.id, p2.id);
            }
            return compare;
        });

        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person(i); //tạo mỗi đối tượng 
            personQueue.offer(persons[i]);  //hàng chờ sẽ lấy tham chiếu địa chỉ của đối tượng vựa tạo
        }

        int m = sc.nextInt();
        Integer[] tasks = new Integer[m];
        for (int i = 0; i < tasks.length;i++) {
            tasks[i] = sc.nextInt();
        }

        Arrays.sort(tasks, Comparator.reverseOrder());

        for (int t = 0; t < tasks.length;t++) {
            var person = personQueue.poll();
            person.workload+= tasks[t];
            personQueue.offer(person);
        }

        for (Person p : persons) {
            sb.append(p.workload).append(" ");
        }
        System.out.println(sb);
    }

}
