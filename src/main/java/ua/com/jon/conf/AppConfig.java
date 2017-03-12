package ua.com.jon.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Bohdan on 12.03.2017
 */
@Configuration
@EnableScheduling
@ComponentScan(basePackages = "ua.com.jon", excludeFilters = {@ComponentScan.Filter(Configuration.class)})
public class AppConfig {

}
