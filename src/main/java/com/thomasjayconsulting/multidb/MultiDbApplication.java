package com.thomasjayconsulting.multidb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//9191
@SpringBootApplication
public class MultiDbApplication {

    public static void main(String[] args) {
    	System.out.println("Multiple database ....");
        SpringApplication.run(MultiDbApplication.class, args);
    }

}
