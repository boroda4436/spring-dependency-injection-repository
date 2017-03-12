package ua.com.jon.service.impl;

import org.springframework.stereotype.Service;
import ua.com.jon.service.TestService;

/**
 * Created by Bohdan on 12.03.2017
 */
@Service
public class TestServiceImpl implements TestService {

    public void doSmth() {
        System.out.println("Hello! I'm test method");
    }
}
