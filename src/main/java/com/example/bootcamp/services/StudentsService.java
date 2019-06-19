/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.services;

import com.example.bootcamp.entities.Students;
import com.example.bootcamp.repositories.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Los_e
 */
@Service
public class StudentsService {
    @Autowired
    private StudentsRepo studentsRepo;
    
public Students getUserFromTable(String username) {
    
     return   studentsRepo.findStudentsByUsername(username);

}
}
