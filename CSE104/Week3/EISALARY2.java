package Week3;

import java.util.Scanner;

public class EISALARY2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int employees = sc.nextInt();

        double[] salaries = new double[employees];
        double totalOfficeSalary = 0;
        double totalOfficeHours = 0;
        double totalOvtSalary = 0;
        double totalOvtHours = 0;

        for (int i = 0; i < employees; i++) {
            double[] workingDays = new double[5];

            for (int j = 0; j < workingDays.length; j++) {
                workingDays[j] = sc.nextDouble();
            }

            double wage = sc.nextDouble();
            double[] result = calculatingSalaryEachEmployee(workingDays, wage);
            salaries[i] = result[0];
            totalOfficeSalary += result[1];
            totalOfficeHours += result[2];
            totalOvtSalary += result[3];
            totalOvtHours += result[4];
        }

        display(salaries, totalOfficeHours, totalOfficeSalary, totalOvtHours, totalOvtSalary);
    }

    public static double[] calculatingSalaryEachEmployee(double[] workingDays, double wage) {
        double totalOfficeSalary = 0;
        double totalOfficeHours = 0;
        double totalOvtSalary = 0;
        double totalOvtHours = 0;
        double totalSalary = 0;

        for (int i = 0; i < workingDays.length; i++) {
            double hours = workingDays[i];
            if (hours <= 8) {
                double salary = hours * wage;
                totalSalary += salary;
                totalOfficeSalary += salary;
                totalOfficeHours += hours;
            } else {
                double officeSalary = 8 * wage;
                double ovtHours = hours - 8;
                double ovtSalary = ovtHours * wage * 1.5;

                totalSalary += officeSalary + ovtSalary;
                totalOfficeSalary += officeSalary;
                totalOfficeHours += 8;
                totalOvtSalary += ovtSalary;
                totalOvtHours += ovtHours;
            }
        }

        return new double[] { totalSalary, totalOfficeSalary, totalOfficeHours, totalOvtSalary, totalOvtHours };
    }

    public static void display(double[] salaries, double totalOfficeHours, double totalOfficeSalary,
            double totalOvtHours, double totalOvtSalary) {
        for (double salary : salaries) {
            System.out.printf("%.2f\n", salary);
        }
        if (totalOfficeHours > 0) {
            double avgOfficeSalary = totalOfficeSalary / totalOfficeHours;
            System.out.printf("%.2f%n", avgOfficeSalary);
        }
        else System.out.println(0.0);

        if (totalOvtHours > 0) {
            double avgOvtSalary = totalOvtSalary / totalOvtHours;
            System.out.printf("%.2f%n", avgOvtSalary);
        } else {
            System.out.println(0.0);
        }
    }
}
// Submitted 100%