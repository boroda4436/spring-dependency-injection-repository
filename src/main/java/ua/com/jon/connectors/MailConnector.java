package ua.com.jon.connectors;

import lombok.extern.log4j.Log4j;

/**
 * Created by Bohdan on 14.03.2017
 */
@Log4j
public class MailConnector {
    public void connect(String login, String password, String domain){
        log.info("Connected to mail: login=" + login + ", password=" + password + ", on domain=" + domain);
    }
}
