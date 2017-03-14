package ua.com.jon.connectors;

import lombok.extern.log4j.Log4j;
import ua.com.jon.dto.connector.AbstractSettings;
import ua.com.jon.dto.connector.MailConnectorSettings;

/**
 * Created by Bohdan on 14.03.2017
 */
@Log4j
public class MailConnector {
    public void connect(AbstractSettings abstractSettings){
        if (!abstractSettings.getClass().equals(MailConnectorSettings.class)) throw new RuntimeException("Incorrect settings for MailConnector");

        MailConnectorSettings mailConnectorSettings = (MailConnectorSettings) abstractSettings;

        String login = mailConnectorSettings.getLogin();
        String password = mailConnectorSettings.getPassword();
        String domain = mailConnectorSettings.getDomain();
        log.info("Connected to mail: login=" + login + ", password=" + password + ", on domain=" + domain);
    }
}
