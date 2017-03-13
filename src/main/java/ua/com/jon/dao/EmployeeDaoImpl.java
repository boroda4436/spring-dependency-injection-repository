package ua.com.jon.dao;

import ua.com.jon.dto.Employee;
import ua.com.jon.dto.Salary;

import java.text.DecimalFormat;

/**
 * Created by Bohdan on 14.03.2017
 */
public class EmployeeDaoImpl {

    public Salary getSalary(Employee employee) {
        DecimalFormat df = new DecimalFormat("#.00");
        Double amount = Double.valueOf(df.format(Math.random()*100).replace(",", "."));;

        return new Salary(amount, "USD");
    }
}
