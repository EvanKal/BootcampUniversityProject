/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.controllers;

import com.example.bootcamp.entities.LoginTable;
import com.example.bootcamp.services.AdministratorService;
import com.example.bootcamp.services.LoginTableService;
import com.example.bootcamp.services.StudentsService;
import com.example.bootcamp.services.TrainersService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Los_e
 */
@Controller
public class HomeController {

    @Autowired
    private LoginTableService loginTableService;
    @Autowired
    private AdministratorService administratorService;
    @Autowired
    private StudentsService studentsService;
    @Autowired
    private TrainersService trainersService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomePage(ModelMap mm
    ) {

        mm.addAttribute("logintable", new LoginTable());
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginAction(ModelMap mm,
            @ModelAttribute("logintable") LoginTable logintable,
            HttpSession session
    ) {

        LoginTable logintablefetcheduser = loginTableService.getUserFromTable(logintable.getUsername());

        if (logintablefetcheduser != null) {

            if (logintablefetcheduser.getPasswordLog().equals(logintable.getPasswordLog())) {
                session.setAttribute("username", logintable.getUsername());
                session.setAttribute("role", logintablefetcheduser.getRoles());
//                session.setAttribute("haha", "lol");
                mm.remove("logintable");
                return "redirect:/afterlogin";
//                return "afterlogin";
            } else {
                LoginTable logintablenew = new LoginTable();
                logintablenew.setUsername(logintable.getUsername());
                mm.addAttribute("wrongpassword", true);
                mm.addAttribute("logintable", logintablenew);
                return "index";
            }
        } else {
            mm.addAttribute("logintable", new LoginTable());
            mm.addAttribute("wrongusername", true);
            return "index";
        }
    }

    @RequestMapping(value = "/afterlogin", method = RequestMethod.GET)
    public String showAfterLogin(ModelMap mm,
            HttpSession session) {
        
        if(session.getAttribute("role").equals("1")) {
          session.setAttribute("user", studentsService.getUserFromTable((String)session.getAttribute("username")));
        }
        if(session.getAttribute("role").equals("2")) {
          session.setAttribute("user", trainersService.getUserFromTable((String)session.getAttribute("username")));
        }
        if(session.getAttribute("role").equals("3")) {
          session.setAttribute("user", administratorService.getUserFromTable((String)session.getAttribute("username")));
        }
        return "afterlogin";
    }
    }
