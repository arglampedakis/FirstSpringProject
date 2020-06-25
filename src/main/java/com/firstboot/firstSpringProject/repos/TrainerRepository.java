/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.repos;

import com.firstboot.firstSpringProject.model.Trainer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author glamb
 */
//ena tetoio repo gia kathe Entity
@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

    // de xreiazetai implementation an einai grammenh swsta ayth h methodos,
    //exei t spring data tropo na t ftiaksei mn t. Thelei sygkekrimeno onoma
    //Query methods
//    List<Trainer> findTop3Age();
//    List<Trainer> findByAge(int age);
    
    List<Trainer> findByTrNameStartingWithAndAgeGreaterThan(String trName, int age);
    
    List<Trainer> findByTrNameStartingWith(String trName);
    
    @Query("SELECT t FROM Trainer t WHERE t.trName LIKE :name% AND t.age > :age")
    List<Trainer> getByJPQL(@Param("name") String name,@Param("age") Integer age);
    
    @Query(value = "SELECT * FROM TRAINERS t WHERE t.tr_name LIKE :name% AND t.age > :age", nativeQuery = true)
    List<Trainer> getByNativeSQL(@Param("name") String name,@Param("age") Integer age);
}
