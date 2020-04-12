package com.example.demo.myControllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //the controller
public class MyControllers {
    //mapping HTTP method (no state method, default = GET)
    @RequestMapping(value = "/test")
    public String getHelloWorld(){
        return "Hello happy Sunday :)";
    }
}
