package com.marat.spring;



@org.springframework.stereotype.Controller
public class Controller {
    @org.springframework.web.bind.annotation.GetMapping("/test")
    public String doTest() {
        return "test";
    }
}
