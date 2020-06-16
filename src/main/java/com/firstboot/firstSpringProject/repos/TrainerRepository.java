/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.repos;

import com.firstboot.firstSpringProject.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author glamb
 */
//ena tetoio repo gia kathe Entity
@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    
}
