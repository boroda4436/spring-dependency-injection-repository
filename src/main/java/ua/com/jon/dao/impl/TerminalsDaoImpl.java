package ua.com.jon.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ua.com.jon.dao.TerminalsDao;

/**
 * Created by Bohdan on 17.03.2017
 */
@Repository
public class TerminalsDaoImpl implements TerminalsDao {
    @Autowired
    @Qualifier("remote")
    private JdbcTemplate template;

}
