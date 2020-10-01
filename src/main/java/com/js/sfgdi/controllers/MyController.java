package com.js.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello Worls!!!");
        return "Welcome to DI";
    }
}
