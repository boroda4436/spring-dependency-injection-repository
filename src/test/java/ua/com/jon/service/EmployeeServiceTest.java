package ua.com.jon.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import ua.com.jon.conf.AppConfig;
import ua.com.jon.dao.ConnectorSettingsDao;
import ua.com.jon.dao.EmployeeDao;
import ua.com.jon.dao.impl.ConnectorSettingsDaoImpl;
import ua.com.jon.dao.impl.EmployeeDaoImpl;
import ua.com.jon.dto.Salary;
import ua.com.jon.service.impl.EmployeeServiceImpl;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by Bohdan on 16.03.2017
 */

@ContextConfiguration(classes = AppConfig.class)
public class EmployeeServiceTest {

    private ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);


    @Test
    public void getRandomSalary() throws Exception {
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        assertNotNull(ctx);
        assertNotNull(employeeService);

        Salary salary = employeeService.getRandomSalary();
        assertNotNull(salary);
    }


    @Test
    public void getSalaryWithMockServiceCreation() throws NoSuchFieldException, IllegalAccessException {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        ConnectorSettingsDao connectorSettingsDao = new ConnectorSettingsDaoImpl();
        EmployeeService employeeService = new EmployeeServiceImpl(employeeDao, connectorSettingsDao);


        Field employeeDaoField = employeeService.getClass().getDeclaredField("employeeDao");
        employeeDaoField.setAccessible(true);
        employeeDaoField.set(employeeService, employeeDao);

        Salary salary = employeeService.getRandomSalary();
        assertNotNull(salary);
    }

}