package ua.com.jon.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import ua.com.jon.service.TestService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Log4j
@Controller
public class HomeController {

    @Autowired
    private TestService testService;

    public HomeController(){
        System.out.println("init HomeController successfully");
        log.info("init HomeController successfully");
    }

    @Scheduled(cron = "0/5 * * * * ?")
    public void test(){
        log.info("Run test method");
        System.out.println("Run test method");
        testService.doSmth();
    }
}
