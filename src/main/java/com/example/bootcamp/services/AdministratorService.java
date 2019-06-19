/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.services;

import com.example.bootcamp.entities.Administrator;
import com.example.bootcamp.repositories.AdministratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Los_e
 */
@Service
public class AdministratorService {
    @Autowired
    private AdministratorRepo administratorRepo;
    
public Administrator getUserFromTable(String username) {
    
     return   administratorRepo.findAdministratorByUsername(username);

}
}
