/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Los_e
 */
@Entity
@Table(name = "login_table")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoginTable.findAll", query = "SELECT l FROM LoginTable l")
    , @NamedQuery(name = "LoginTable.findByVat", query = "SELECT l FROM LoginTable l WHERE l.vat = :vat")
    , @NamedQuery(name = "LoginTable.findByUsername", query = "SELECT l FROM LoginTable l WHERE l.username = :username")
    , @NamedQuery(name = "LoginTable.findByPasswordLog", query = "SELECT l FROM LoginTable l WHERE l.passwordLog = :passwordLog")
    , @NamedQuery(name = "LoginTable.findByRoles", query = "SELECT l FROM LoginTable l WHERE l.roles = :roles")})
public class LoginTable implements Serializable {
@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "vat")
    private int vat;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 50)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "password_log")
    private String passwordLog;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "roles")
    private String roles;
    private static final long serialVersionUID = 1L;

    public LoginTable() {
    }


    public String getPasswordLog() {
        return passwordLog;
    }

    public void setPasswordLog(String passwordLog) {
        this.passwordLog = passwordLog;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
}
