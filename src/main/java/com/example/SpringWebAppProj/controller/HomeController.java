package com.example.SpringWebAppProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String homePage(){
        System.out.println("Hi"); //printing on console
        return "home";
    }
}
