package com.ttn.springboot_exercise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootExerciseApplication {

    @Value("${spring.datasource.username}")
    private String developer;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootExerciseApplication.class, args);
        SpringbootExerciseApplication mainClass = context.getBean(SpringbootExerciseApplication.class);
        System.out.println("Application started by: " + mainClass.developer);
        System.out.println(context.getBean("dataSource"));
    }

}
