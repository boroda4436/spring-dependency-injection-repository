package ua.com.jon.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jndi.JndiTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;

import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by Bohdan on 12.03.2017
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = "ua.com.jon", excludeFilters = {@ComponentScan.Filter(Configuration.class)})
public class AppConfig {
    @Autowired
    @Qualifier("documents")
    private DataSource dataSource;

    @Autowired
    @Qualifier("main")
    private DataSource mainDataSource;

    @Autowired
    @Qualifier("remote")
    private DataSource remoteDataSource;

    @Autowired
    @Qualifier("offline")
    private DataSource reserveDataSource;

    /**
     * Allows repositories to access RDBMS data using the JDBC API.
     */
    @Bean(name = "documentsTmpl")
    public JdbcTemplate jdbcTemplate() throws IOException, NamingException {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "mainTmpl")
    public JdbcTemplate jdbcTemplateMain() throws IOException, NamingException {
        return new JdbcTemplate(mainDataSource);
    }

    @Bean(name = "remoteTmpl")
    public JdbcTemplate jdbcTemplateRemote() throws IOException, NamingException {
        return new JdbcTemplate(remoteDataSource);
    }

    @Bean(name = "reserveTmpl")
    public JdbcTemplate jdbcTemplateReserve() throws IOException, NamingException {
        return new JdbcTemplate(reserveDataSource);
    }

    /**
     * Allows transactions to be managed against the RDBMS using the JDBC API.
     */
    @Bean(name = "documentsPM")
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mainPM")
    public PlatformTransactionManager transactionManagerMain() {
        return new DataSourceTransactionManager(mainDataSource);
    }

    @Bean(name = "remotePM")
    public PlatformTransactionManager transactionManagerRemote() {
        return new DataSourceTransactionManager(remoteDataSource);
    }

    @Bean(name = "reservePM")
    public PlatformTransactionManager transactionManagerReserve() {
        return new DataSourceTransactionManager(reserveDataSource);
    }

    @Bean(destroyMethod = "close", name = "documents")
    public DataSource dataSource() throws NamingException {
        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/documents");
    }

    @Bean(destroyMethod = "close", name = "main")
    public DataSource dataSourceMain() throws NamingException {
        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/mainDB");
    }

    @Bean(destroyMethod = "close", name = "remote")
    public DataSource dataSourceRemote() throws NamingException {
        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/remoteDB");
    }

    @Bean(destroyMethod = "close", name = "offline")
    public DataSource dataSourceReserve() throws NamingException {
        return (DataSource) new JndiTemplate().lookup("java:comp/env/jdbc/offlineDB");
    }
}
