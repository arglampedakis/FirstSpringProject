/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author glamb
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String hello(ModelMap mm) {

        mm.addAttribute("message", "Hello from controller");
        mm.addAttribute("another message", "another message from controller");
        return "hi";
    }

    @GetMapping("/start/{bookId}/search/{author}")
    public String hello1(@PathVariable("bookId") String book, ModelMap mm,
            @PathVariable String author) {
        mm.addAttribute("bookId", book);
        mm.addAttribute("author", author);
        return "hi1";
    }

    //url test?type=bmx
    @GetMapping("/test")
    public String hello2(ModelMap mm, @RequestParam(name = "type") String type) {
        mm.addAttribute("bookId", type);
        return "hi1";
    }
    

}
