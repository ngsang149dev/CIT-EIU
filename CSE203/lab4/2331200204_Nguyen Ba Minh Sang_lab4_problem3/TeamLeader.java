package CSE203.lab4.prb3;

import java.time.LocalDate;

import CSE203.lab4.prb1.ProductionWorker;

public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private double requiredTrainingHours;
    private double attendedTrainingHours;
    
    public TeamLeader(String name, String number, LocalDate hireDate, int shift, double hourlyPayRate,
            double monthlyBonus, double requiredTrainingHours, double attendedTrainingHours) {
        super(name, number, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }
    public void setMonthlyBonus(double monthlyBonus) {
        if (monthlyBonus < 0) throw new IllegalArgumentException("Monthly bonus cannot be negative.");
        this.monthlyBonus = monthlyBonus;
    }
    public double getRequiredTrainingHours() {
        return requiredTrainingHours;
    }
    public void setRequiredTrainingHours(double requiredTrainingHours) {
        if (requiredTrainingHours < 0) throw new IllegalArgumentException("Required training hours cannot be negative.");
        this.requiredTrainingHours = requiredTrainingHours;
    }
    public double getAttendedTrainingHours() {
        return attendedTrainingHours;
    }
    public void setAttendedTrainingHours(double attendedTrainingHours) {
        if (attendedTrainingHours < 0) throw new IllegalArgumentException("Attended training hours cannot be negative.");
        this.attendedTrainingHours = attendedTrainingHours;
    }

    public double calculateTotalSalary(double hoursWorked) {
        return getHourlyPayRate() * hoursWorked + monthlyBonus;
    }

}
