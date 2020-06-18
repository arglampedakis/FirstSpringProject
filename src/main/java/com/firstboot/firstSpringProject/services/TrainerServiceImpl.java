/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.services;

import com.firstboot.firstSpringProject.model.Trainer;
import com.firstboot.firstSpringProject.repos.TrainerRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author glamb
 */
@Service
public class TrainerServiceImpl implements TrainerServiceInterface {

    @Autowired
    TrainerRepository trainerRepository;

    @Override
    @Transactional
    public void insertTrainer(Trainer trainer) {
// jdbc, JPA (em), JDBCTemplate, Spring Data
        Trainer tr = trainerRepository.save(trainer);
        System.out.println(tr);
    }

    @Override
    public List<Trainer> getTrainersBySearchCriteria(String name, int age) {

        //return trainerRepository.findByTrNameStartingWithAndAgeGreaterThan(name, age);
        return trainerRepository.getByJPQL(name, age); // same as above
    }

}
