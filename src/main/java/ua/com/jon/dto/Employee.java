package ua.com.jon.dto;

import lombok.Data;

/**
 * Created by Bohdan on 14.03.2017
 */
@Data
public class Employee {
    private EmployeeType type;
    private Salary salary;
}
