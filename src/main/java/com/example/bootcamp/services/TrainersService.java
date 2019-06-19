/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.services;

import com.example.bootcamp.entities.Trainers;
import com.example.bootcamp.repositories.TrainersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Los_e
 */
@Service
public class TrainersService {
    @Autowired
    private TrainersRepo trainersRepo;
    
public Trainers getUserFromTable(String username) {
    
     return   trainersRepo.findTrainersByUsername(username);

}
}
