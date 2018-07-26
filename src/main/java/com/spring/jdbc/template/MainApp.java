package com.spring.jdbc.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @kki
 *
 */
@EnableScheduling
@SpringBootApplication
public class MainApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainApp.class, args);
    }
}