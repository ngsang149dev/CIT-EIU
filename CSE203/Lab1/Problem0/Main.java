public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee p2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee p3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println("Name"+ " "+ "ID Number"+ " "+ "Department"+ " "+ "Position");
        p1.display();
        p2.display();
        p3.display();
    }
}