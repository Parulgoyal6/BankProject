package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
 // Ensure all your packages are scanned
public class    BankApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }
}
