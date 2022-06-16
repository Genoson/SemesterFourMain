package com.springbootone.practice;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// Spring Boot Application
//^^ a convenience annotation that auto-configures Spring Boot support for a Java SE application
// ^^ contains a @Configuration annotation
// ^^^^ tags the class as a source of bean definitions for application context
// ^^ contains a @EnableAutoConfiguration annotation
// ^^^^ enables auto-configuration support for the application context based on classpath settings
// ^^ contains a @ComponentScan annotation
// ^^^^ scans the package for components, configurations and services
@SpringBootApplication
public class Application {

    // to run this application, use the following command from a terminal 
    //^^ open from the root directory of the project (practice in this case)
    //./mvnw spring-boot:run

    public static void main(String[] args) {
        // the below line is used to run the application
        // there is no xml (web.xml) file to run the application
        // this is a 100% Java application, no plumbing or infrastructure required
        SpringApplication.run(Application.class, args);
    }

    // CommandLineRunner is used to run code on startup
    // this is formatted as a bean in the application context
    // this example finds all the beans in the application context and prints them
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
