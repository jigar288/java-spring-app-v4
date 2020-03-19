package com.javaspringappv4.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//need to use this annotation to specify that this class is a controller
@Controller
public class myControllerClass {
    @RequestMapping("/")
    @ResponseBody //need this since your're returning something
    public String listOfImages(){
        return "here is a list of images";
    }

}
