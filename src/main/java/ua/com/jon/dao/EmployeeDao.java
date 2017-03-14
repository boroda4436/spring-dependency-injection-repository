package ua.com.jon.dao;

import ua.com.jon.dto.Employee;
import ua.com.jon.dto.Salary;

/**
 * Created by Bohdan on 14.03.2017
 */
public interface EmployeeDao {
    Salary getSalary(Employee employee);
}
