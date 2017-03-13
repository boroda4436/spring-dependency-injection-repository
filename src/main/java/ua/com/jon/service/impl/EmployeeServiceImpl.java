package ua.com.jon.service.impl;

import org.springframework.stereotype.Service;
import ua.com.jon.dao.EmployeeDaoImpl;
import ua.com.jon.dto.Employee;
import ua.com.jon.dto.Salary;
import ua.com.jon.service.EmployeeService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();

    public Salary getRandomSalary() {
        Employee employee = new Employee();

        return employeeDao.getSalary(employee);
    }
}
