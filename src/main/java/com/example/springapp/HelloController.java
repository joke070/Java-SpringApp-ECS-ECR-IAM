package com.example.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
 HEAD
        return "Hello chijioke, welcome Spring!";

        return "Hello guys, welcome to my Spring app!";
 3161edd (Trigger workflow rerun)
    }
}
