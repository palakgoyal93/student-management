package com.example.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "com.example")
public class ComponentScanConfig {
    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);    }
}
