/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.services;

import com.example.bootcamp.entities.LoginTable;
import com.example.bootcamp.repositories.LoginTableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Los_e
 */
@Service
public class LoginTableService {
    @Autowired
    private LoginTableRepo loginTableRepo;
    
public LoginTable getUserFromTable(String username) {
    
     return   loginTableRepo.findLoginTableByUsername(username);

}
}
