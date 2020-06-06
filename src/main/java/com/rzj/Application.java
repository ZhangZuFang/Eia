package com.rzj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = {"com.rzj.*"})
@EntityScan("com.rzj.*")
@MapperScan("com.rzj.mapper.*")
@EnableJpaRepositories("com.rzj.*")
@EnableScheduling
@SpringBootApplication(scanBasePackages = {"com.rzj.*"})
@PropertySource("classpath:application-${spring.profiles.active}.properties")
//@PropertySource("classpath:application-Dev.properties")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Application {
    @Autowired
    private ApplicationContext context;
    Environment env;
    private static final Logger LOG = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
