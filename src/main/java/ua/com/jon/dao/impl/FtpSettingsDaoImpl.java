package ua.com.jon.dao.impl;

import org.springframework.stereotype.Component;
import ua.com.jon.dao.FtpSettingsDao;
import ua.com.jon.dto.connector.AbstractSettings;
import ua.com.jon.dto.connector.ConnectorType;
import ua.com.jon.dto.connector.FtpConnectorSettings;
import ua.com.jon.dto.connector.MailConnectorSettings;

/**
 * Created by Bohdan on 14.03.2017
 */
@Component
public class FtpSettingsDaoImpl implements FtpSettingsDao {

    @Override
    public AbstractSettings getSettings(ConnectorType connectorType) {
        AbstractSettings abstractSettings = null;

        //TODO: just imagine that all this settings are retrieved from DB :)
        FtpConnectorSettings ftpConnectorSettings = new FtpConnectorSettings();
        ftpConnectorSettings.setPort(8080);
        ftpConnectorSettings.setUrl("localhost");

        MailConnectorSettings mailConnectorSettings = new MailConnectorSettings();
        mailConnectorSettings.setDomain("google.com.ua");
        mailConnectorSettings.setLogin("gentleman");
        mailConnectorSettings.setPassword("JUhdsfui398dh7832ihrfd74");

        if (connectorType==ConnectorType.FTP) abstractSettings = ftpConnectorSettings;
        if (connectorType==ConnectorType.MAIL) abstractSettings = mailConnectorSettings;

        return abstractSettings;
    }
}
