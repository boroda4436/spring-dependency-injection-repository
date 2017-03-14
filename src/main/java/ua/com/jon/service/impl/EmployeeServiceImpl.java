package ua.com.jon.service.impl;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.jon.dao.EmployeeDao;
import ua.com.jon.dao.ConnectorSettingsDao;
import ua.com.jon.dto.Employee;
import ua.com.jon.dto.Salary;
import ua.com.jon.dto.connector.ConnectorType;
import ua.com.jon.dto.connector.FtpConnectorSettings;
import ua.com.jon.service.EmployeeService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Log4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    private ConnectorSettingsDao connectorSettingsDao;

    public Salary getRandomSalary() {
        Employee employee = new Employee();

        return employeeDao.getSalary(employee);
    }

    @Override
    public void runInjectionExample() {
        FtpConnectorSettings settings = (FtpConnectorSettings) connectorSettingsDao.getSettings(ConnectorType.FTP);
        Salary salary = employeeDao.getSalary(new Employee());

        log.info("FtpConnectorSettings example: " + settings.toString());
        log.info("Salary example: " + salary.toString());
    }

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Autowired
    public void setConnectorSettingsDao(ConnectorSettingsDao connectorSettingsDao) {
        this.connectorSettingsDao = connectorSettingsDao;
    }
}
