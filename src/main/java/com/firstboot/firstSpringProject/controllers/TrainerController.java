/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import com.firstboot.firstSpringProject.model.Trainer;
import com.firstboot.firstSpringProject.services.TrainerServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author glamb
 */
@Controller
public class TrainerController {

    /*
    @ModelAttribute
    public void methodThatRunsBefore() {
        //For every request that is about to be processed from this controller class (TrainerController), 
        //the methodThatRunsBefore() will run first, and then the respective method will run

    }
     */
    //spring dependency injection 
    @Autowired
    //    @Qualifier("TrainerServiceImpl")
    // an yparxoyn διαφορετικα implementions τ ιδιου interface,
    //διαλεγεις ποιο απο αυτα θελεις να χρησιμοποιησεις
    TrainerServiceInterface trainerServiceInterface;

    //o controller που θα ΕΜΦΑΝΙΣΕΙ την φορμα
    @GetMapping("/preinserttrainer")
    public String showTrainerForm(ModelMap mm) {

        mm.addAttribute("newtrainer", new Trainer());
        return "trainerform";
    }

    @PostMapping("/doinserttrainer")
    public String insertTrainer(ModelMap mm,
            @ModelAttribute("newtrainer") Trainer t) {
//        instead of  TrainerServiceImpl tsi = new TrainerServiceImpl();
//        tsi.insertTrainer(t);

        trainerServiceInterface.insertTrainer(t);
        mm.addAttribute("trainer", t);

        return "result";
    }

    @PostMapping("/searchTrainer")
    public String searchForTrainers(ModelMap mm,
            @RequestParam(name = "name") String trainerName,
            @RequestParam(name = "age") int age) {

        List<Trainer> result
                = trainerServiceInterface.getTrainersBySearchCriteria(trainerName, age);

        mm.addAttribute("resultTrainers", result);
        return "searchResults";
    }
}
