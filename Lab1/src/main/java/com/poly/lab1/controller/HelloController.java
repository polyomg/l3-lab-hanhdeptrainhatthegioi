package com.poly.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/poly/hello")
    public String hello() {
        return "hello";  // trỏ tới file hello.html trong templates
    }
}
