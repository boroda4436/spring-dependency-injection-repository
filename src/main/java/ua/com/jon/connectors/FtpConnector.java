package ua.com.jon.connectors;

import lombok.extern.log4j.Log4j;
import ua.com.jon.dto.connector.AbstractSettings;
import ua.com.jon.dto.connector.FtpConnectorSettings;

/**
 * Created by Bohdan on 14.03.2017
 */
@Log4j
public class FtpConnector {
    public void connect(AbstractSettings abstractSettings){
        if (!abstractSettings.getClass().equals(FtpConnectorSettings.class)) throw new RuntimeException("Incorrect settings");
        FtpConnectorSettings ftpConnectorSettings = (FtpConnectorSettings) abstractSettings;
        String url = ftpConnectorSettings.getUrl();
        int port = ftpConnectorSettings.getPort();
        log.info("Connected to ftp: url=" + url + ", port=" + port);
    }
}
