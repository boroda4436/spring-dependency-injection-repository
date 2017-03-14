package ua.com.jon.dto.connector;

/**
 * Created by Bohdan on 14.03.2017
 */
public class FtpConnectorSettings extends AbstractSettings {
    private String url;
    private int port;

    public FtpConnectorSettings() {
        this.url = url;
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
