package com.springbootone.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest Controller is used to handle web requests
// ^^ used by Spring MVC
// ^^ returns data not a view
@RestController
public class HelloController {


    // GetMapping binds the method to the URL
    @GetMapping("/")
    public String index() {
        return "Hello From my first Spring Boot Application!";
    }
    
}
