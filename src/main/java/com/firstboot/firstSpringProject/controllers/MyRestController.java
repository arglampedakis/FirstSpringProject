/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.controllers;

import com.firstboot.firstSpringProject.model.Trainer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author glamb
 */
@RestController //oles oi methods p exoume edw, oti epistrefoun, thelw na t valeis st response k na t steileis pisw st client
// enw me @Controller, to return einai to onoma ths selidas p thelw na deiksei
public class MyRestController {

//    @ResponseBody // anti na kanw olh tn klassh RestController, kanw mn mia methodo me auto to annottation
    @GetMapping("/restendpoint")
    public List<Trainer> foo() {
        Trainer tr = new Trainer();
        tr.setTrName("argiris");
        tr.setAge(30);
        tr.setSurname("Glamp");
        tr.setTrId(5);
        Trainer tr2 = new Trainer();
        tr2.setTrName("Makis");
        tr2.setAge(25);
        tr2.setSurname("Nick");
        tr2.setTrId(3);
        List<Trainer> result = new ArrayList<>();
        result.add(tr);
        result.add(tr2);
        return result;
    }
}
