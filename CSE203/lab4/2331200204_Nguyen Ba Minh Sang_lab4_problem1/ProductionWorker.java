package CSE203.lab4.prb1;

import java.time.LocalDate;

public class ProductionWorker extends Employee{
    private int shift;
    private double hourlyPayRate;

    public boolean isValidNumber(String number) {
        if (number == null || number.length() != 5) return false;

        for (int i = 0; i < number.length(); i++) {
            if (i < 3) {
                if (!isValidX(number.charAt(i))) return false;
            }
            else if (i == 3) {
                if (number.charAt(i) != '-') return false;
            } else {
                if (!isValidL(number.charAt(i))) return false;
            }
        }
        return true;
    }

    private boolean isValidL(char c) {
        return c >= 'A' && c <= 'M';
    }

    private boolean isValidX(char c) {
        return Character.isDigit(c);
    }

    public ProductionWorker(String name, String number, LocalDate hireDate, int shift, double hourlyPayRate) {
        super(name, number, hireDate);
        setShift(shift);
        setHourlyPayRate(hourlyPayRate);
    }


    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        if (shift != 1 && shift != 2) throw new IllegalArgumentException("Shift must be 1 or 2.");
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        if (hourlyPayRate < 0) throw new  IllegalArgumentException("Hourly pay rate cannot be negative.");  
        this.hourlyPayRate = hourlyPayRate;
    }
    
}
