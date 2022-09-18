package com.qihang.objectiondetectioncomputer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ObjectionDetectionComputerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObjectionDetectionComputerApplication.class, args);
    }

}
