package ua.com.jon.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import ua.com.jon.dto.Salary;
import ua.com.jon.service.EmployeeService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Log4j
@Controller
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){

        Salary salary = employeeService.getRandomSalary();
        log.info("Salary: " +  salary.toString());
    }
}
