 package RevisionForFinal;

import java.util.Arrays;
import java.util.Scanner;

public class EIWORKER {
    static long[] ranges = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000,
            Long.MAX_VALUE / 2 };
    static double[] rates = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
    static Scanner sc = new Scanner(System.in);

    static double[] cumulativeTax;

    public static void main(String[] args) {
        prepareTaxTable();
        int n = sc.nextInt();
        int k = sc.nextInt();
        double productValue = sc.nextDouble();

        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int productivity = sc.nextInt();
            double amountDeducted = sc.nextDouble();
            employees[i] = new Employee(name, productivity, amountDeducted, productValue);
        }

        Arrays.sort(employees);

        output(k, n, employees);

    }

    public static void output(int rewards, int n, Employee[] employees) {
        int limit = Math.min(rewards, n);
        while (limit > 0 && limit < n && employees[limit - 1].getNet() == employees[limit].getNet()) {
            limit--;
        }
        for (int i = 0; i < limit; i++) {
            System.out.println(employees[i]);
        }
    }

    static void prepareTaxTable() {
        cumulativeTax = new double[ranges.length];
        cumulativeTax[0] = 0;
        for (int i = 1; i < ranges.length; i++) {
            double rangeAmount = ranges[i] - ranges[i - 1];
            cumulativeTax[i] = cumulativeTax[i - 1] + (rangeAmount * rates[i - 1]);
        }
    }
}

class Employee implements Comparable<Employee> {
    private String name;
    private double net;

    public Employee(String name, int productivity, double amountDeducted, double productValue) {
        this.name = name;
        calculateNet(productivity, amountDeducted, productValue);
    }

    public String getName() {
        return name;
    }

    public double getNet() {
        return net;
    }

    public void calculateNet(int productivity, double amountDeducted, double productValue) {
        final double TAX_FREE_LIMIT = 9_000_000;
        double gross = productValue * productivity;
        double tax = 0;
        if (gross <= TAX_FREE_LIMIT) {
            tax = 0;
        } else {
            double taxable = gross - TAX_FREE_LIMIT - amountDeducted;
            for (int i = 0; i < EIWORKER.ranges.length - 1; i++) {
                if (taxable > EIWORKER.ranges[i]) {
                    tax += (Math.min(taxable, EIWORKER.ranges[i + 1]) - EIWORKER.ranges[i]) * EIWORKER.rates[i];
                } else {
                    break;
                }
            }
        }
        this.net = gross - tax;
    }

    @Override
    public int compareTo(Employee other) {
        int netCompare = Double.compare(other.net, this.net);
        if (netCompare != 0)
            return netCompare;

        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name + " " + Math.round(this.net);
    }
}
