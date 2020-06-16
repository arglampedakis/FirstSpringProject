/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author glamb
 */
@Controller
public class MyController {

    @PostMapping("/login")
    public String doLogin(ModelMap mm,
            @RequestParam(name = "name") String name,
            @RequestParam(name = "password") String password) {

        mm.addAttribute("name",name);
        mm.addAttribute("password",password);
        
        return "result";
    }
}
