package CSE203.lab4.prb2;

import java.time.LocalDate;

import CSE203.lab4.prb1.Employee;

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double annualProductionBonus;
    

    public ShiftSupervisor(String name, String number, LocalDate hireDate, double annualSalary,
            double annualProductionBonus) {
        super(name, number, hireDate);
        setAnnualSalary(annualSalary);
        setAnnualProductionBonus(annualProductionBonus);
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if (annualSalary < 0) throw new IllegalArgumentException("Annual Salary cannot be negative.");
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        if (annualProductionBonus < 0) throw new IllegalArgumentException("Production bonus cannot be negative.");
        this.annualProductionBonus = annualProductionBonus;
    }

    public double calculateTotalSalary() {
        return annualSalary + annualProductionBonus;
    }
}
