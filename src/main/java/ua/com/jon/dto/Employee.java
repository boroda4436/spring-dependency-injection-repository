package ua.com.jon.dto;

/**
 * Created by Bohdan on 14.03.2017
 */
public class Employee {
    private EmployeeType type;
    private Salary salary;

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
