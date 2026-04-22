public class Main {

    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.setName("Susan");
        p1.setIdNumber(47899);
        p1.setDepartment("Accounting");
        p1.setPosition("Vice President");

        Employee p2 = new Employee("Mark Jones", 39119);
        p2.setDepartment("IT");
        p2.setPosition("Programmer");

        Employee p3 = new Employee("Joy Roger", 81774, "Manufacturing", "Engineer");

        System.out.println(p1);
    }
}