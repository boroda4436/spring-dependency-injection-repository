package ua.com.jon.dto.connector;

/**
 * Created by Bohdan on 14.03.2017
 */
public class MailConnectorSettings extends AbstractSettings {
    private String login;
    private String password;
    private String domain;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
