package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGreetingController {

    @GetMapping("/students/greet")
    public String greetStudent(@RequestParam(defaultValue = "Student") String name) {
        return "Hello, " + name + "! Welcome to the greeting system.";
    }
}
