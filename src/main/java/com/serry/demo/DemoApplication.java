package com.serry.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 集成mybatis
 * @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.serry.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

