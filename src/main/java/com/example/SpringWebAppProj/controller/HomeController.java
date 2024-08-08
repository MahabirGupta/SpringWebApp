package com.example.SpringWebAppProj.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String homePage(HttpServletRequest httpServletRequest){ // send a request

        HttpSession httpSession = httpServletRequest.getSession();
        String name = httpServletRequest.getParameter("name"); // to get the name parameter
        System.out.println("Hi " + name); //printing on console and verfiy is the name coming back
        httpSession.setAttribute("name",name);
        return "home"; //don't put .jsp at the end
    }
}
