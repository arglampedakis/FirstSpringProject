/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import com.firstboot.firstSpringProject.model.Trainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author glamb
 */
@Controller
public class TrainerController {

    //o controller που θα ΕΜΦΑΝΙΣΕΙ την φορμα
    @GetMapping("preinserttrainer")
    public String showTrainerForm(ModelMap mm) {

        mm.addAttribute("newtrainer", new Trainer());
        return "trainerform";
    }

    @PostMapping("/doinserttrainer")
    public String insertTrainer(ModelMap mm,
            @ModelAttribute("newtrainer") Trainer t) {
        mm.addAttribute("trainer", t);

        return "result";
    }
}
