/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.repositories;

import com.example.bootcamp.entities.Administrator;
import com.example.bootcamp.entities.LoginTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Los_e
 */
@Repository
public interface AdministratorRepo extends JpaRepository<Administrator, String>{
    
    Administrator findAdministratorByUsername(String username);
}
