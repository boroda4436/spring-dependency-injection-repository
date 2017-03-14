package ua.com.jon.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import ua.com.jon.connectors.FtpConnector;
import ua.com.jon.connectors.MailConnector;
import ua.com.jon.service.EmployeeService;

import java.util.List;

/**
 * Created by Bohdan on 12.03.2017
 */
@Log4j
@Controller
public class HomeController {

    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){

        String ftpUrl = "localhost";
        int ftpPort = 8080;

        FtpConnector ftpConnector = new FtpConnector();
        ftpConnector.connect(ftpUrl, ftpPort);

        String mailLogin = "test";
        String mailPassword = "pass";
        String mailDomain = "google.com.ua";

        MailConnector mailConnector = new MailConnector();
        mailConnector.connect(mailLogin, mailPassword, mailDomain);

    }
}
