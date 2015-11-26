package com.springmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 

 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/welcome")
    public String hello(Model model) {
         
        //model.addAttribute(" ", "Hello Spring MVC2");
        
       return "welcome";
        //return "helloworld";
         
    }
 
}