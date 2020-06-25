/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.services;

import com.firstboot.firstSpringProject.model.Trainer;
import java.util.List;

/**
 *
 * @author glamb
 */
public interface TrainerServiceInterface {

    public void insertTrainer(Trainer trainer);

    public List<Trainer> getTrainersBySearchCriteria(String name, int age);
    
    public List<Trainer> getTrainerByNameLike(String name);
//    public void deleteTrainer(Trainer trainer);
//    public void updateTrainer(Trainer trainer);
    
}
