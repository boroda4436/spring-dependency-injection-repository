package ua.com.jon.dao;

import ua.com.jon.dto.connector.AbstractSettings;
import ua.com.jon.dto.connector.ConnectorType;

/**
 * Created by Bohdan on 14.03.2017
 */
public interface FtpSettingsDao {
    AbstractSettings getSettings(ConnectorType connectorType);
}
