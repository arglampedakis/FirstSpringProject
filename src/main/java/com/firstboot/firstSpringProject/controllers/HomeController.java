/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author glamb
 */
@Controller
public class HomeController {
    
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello(ModelMap mm){
        
        mm.addAttribute("message", "Hello from controller");
        mm.addAttribute("another message", "another message from controller");
    return "hi";
    }
    
    @GetMapping("/start")
    public String hello1(){
        
    return "hi1";
    }
}
