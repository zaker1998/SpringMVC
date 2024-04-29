package com.marat.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.Objects;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String sayHelloPage(@RequestParam(value = "name", required = false) String name,
                               @RequestParam(value = "surname", required = false) String surname,
                               Model model) {
        if (name != null && !name.isEmpty() && surname != null && !surname.isEmpty()) {
            System.out.println(name + surname);
            model.addAttribute("name", name);
            model.addAttribute("surname", surname);
            return "first/paramOut";
        }
        return "first/hello";
    }

    @GetMapping("/calculator")
    public String sayGoodbyePage(@RequestParam(value = "a", required = false) int a,
                                 @RequestParam(value = "b", required = false) int b,
                                 @RequestParam(value = "operation", required = false) String operation,
                                 Model model){
        int result = 0;
        if(Objects.equals(operation, "+")){
            result = a+b;
        } else if (Objects.equals(operation, "-")) {
            result = a-b;
        } else if (Objects.equals(operation, "*")) {
            result = a*b;
        } else if (Objects.equals(operation, "/")) {
            result = a/b;
        }
        model.addAttribute("a", a);
        model.addAttribute("b", b);
        model.addAttribute("operation", operation);
        model.addAttribute("result", result);

        System.out.println(a + "|" + b + "|" + operation + "=" + result);


        return "first/paramOut";
    }
}

