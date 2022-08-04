package com.ackepenek.springbeanstread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBeansTreadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeansTreadApplication.class, args);
    }

}
