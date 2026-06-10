package CSE203.lab4.prb1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String number;
    private LocalDate hireDate;

    public Employee(String name, String number, LocalDate hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

}
