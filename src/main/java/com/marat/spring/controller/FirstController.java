package com.marat.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHelloPage(){
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodbyePage(){
        return "first/goodbye";
    }
}
