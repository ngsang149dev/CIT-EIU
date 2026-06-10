package CSE203.lab5.p3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeMap {
    static Map<String,Employee> employeeMap = new HashMap<>(); 
    static List<Employee> employees = new ArrayList<>(employeeMap.values());

    public void addEmployee(String name) {
        Employee e = new Employee(name);
        employeeMap.putIfAbsent(name, e);
    }

    public static void printAll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public static void searchEmployee(String name) {
        for (Employee e : employees) {
            if (e.getName().equals(name)) {
                System.out.println(e);
            }
        }
    }

}
