package com.dailycodebuffer.SpringBoot.Tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Auskommentiert für Adding Config in Properties File
    /*
    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/") // kann so direkt verwendet werden
    public String helloWorld() {
        return "Welcome to Daily Code Buffer.";
    }
    */

    // Adding Config in Properties File

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String helloWorld() {
        return welcomeMessage;
    }

}
