package ua.com.jon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.jon.connectors.FtpConnector;
import ua.com.jon.connectors.MailConnector;
import ua.com.jon.dao.ConnectorSettingsDao;
import ua.com.jon.dto.Salary;
import ua.com.jon.dto.connector.ConnectorType;
import ua.com.jon.service.EmployeeService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Log4j
@Controller
@RequiredArgsConstructor(onConstructor = @__({@Autowired}))
public class HomeController {

    private final ConnectorSettingsDao connectorSettingsDao;
    private final EmployeeService employeeService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){

        FtpConnector ftpConnector = new FtpConnector();
        ftpConnector.connect(connectorSettingsDao.getSettings(ConnectorType.FTP));

        MailConnector mailConnector = new MailConnector();
        mailConnector.connect(connectorSettingsDao.getSettings(ConnectorType.MAIL));

        employeeService.runInjectionExample();

    }

    @RequestMapping(value = "/home")
    public  void method(@RequestBody Salary salary){

    }
}
