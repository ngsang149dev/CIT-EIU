package lab6.p2;

public class FullTimeEmployee implements Employee {
    private String name;
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getEmployeeType() {
        return "Full-Time";
    }

    @Override
    public double calculatePay() {
        // TODO Auto-generated method stub
        return 0;
    }
}
