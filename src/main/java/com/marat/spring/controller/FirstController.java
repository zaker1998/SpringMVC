package com.marat.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHelloPage(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname){
        if(!(name.equals("")) && !(surname.equals("")))
        {
            System.out.println(name + surname);
            return "first/paramOut";
        }
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String sayGoodbyePage(){
        return "first/goodbye";
    }
}
