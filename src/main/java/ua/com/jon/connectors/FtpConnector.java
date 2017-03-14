package ua.com.jon.connectors;

import lombok.extern.log4j.Log4j;

/**
 * Created by Bohdan on 14.03.2017
 */
@Log4j
public class FtpConnector {
    public void connect(String url, int port){
        log.info("Connected to ftp: url=" + url + ", port=" + port);
    }
}
