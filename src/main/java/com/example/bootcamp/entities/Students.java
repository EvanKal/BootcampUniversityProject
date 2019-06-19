/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bootcamp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Los_e
 */
@Entity
@Table(name = "students")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByVat", query = "SELECT s FROM Students s WHERE s.vat = :vat")
    , @NamedQuery(name = "Students.findByUsername", query = "SELECT s FROM Students s WHERE s.username = :username")
    , @NamedQuery(name = "Students.findByPasswordLog", query = "SELECT s FROM Students s WHERE s.passwordLog = :passwordLog")
    , @NamedQuery(name = "Students.findByFirstName", query = "SELECT s FROM Students s WHERE s.firstName = :firstName")
    , @NamedQuery(name = "Students.findByLastName", query = "SELECT s FROM Students s WHERE s.lastName = :lastName")
    , @NamedQuery(name = "Students.findByDateofBirth", query = "SELECT s FROM Students s WHERE s.dateofBirth = :dateofBirth")
    , @NamedQuery(name = "Students.findByTuitionFees", query = "SELECT s FROM Students s WHERE s.tuitionFees = :tuitionFees")
    , @NamedQuery(name = "Students.findByStreamStudent", query = "SELECT s FROM Students s WHERE s.streamStudent = :streamStudent")
    , @NamedQuery(name = "Students.findByTypeStudent", query = "SELECT s FROM Students s WHERE s.typeStudent = :typeStudent")})
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "vat")
    private Integer vat;
    @Basic(optional = false)
    @NotNull
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
    @Size(min = 1, max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "dateofBirth")
    @Temporal(TemporalType.DATE)
    private Date dateofBirth;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "tuitionFees")
    private Float tuitionFees;
    @Size(max = 10)
    @Column(name = "streamStudent")
    private String streamStudent;
    @Size(max = 10)
    @Column(name = "typeStudent")
    private String typeStudent;

    public Students() {
    }

    public Students(Integer vat) {
        this.vat = vat;
    }

    public Students(Integer vat, String username, String passwordLog, String firstName, String lastName) {
        this.vat = vat;
        this.username = username;
        this.passwordLog = passwordLog;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordLog() {
        return passwordLog;
    }

    public void setPasswordLog(String passwordLog) {
        this.passwordLog = passwordLog;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public Float getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(Float tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getStreamStudent() {
        return streamStudent;
    }

    public void setStreamStudent(String streamStudent) {
        this.streamStudent = streamStudent;
    }

    public String getTypeStudent() {
        return typeStudent;
    }

    public void setTypeStudent(String typeStudent) {
        this.typeStudent = typeStudent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vat != null ? vat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.vat == null && other.vat != null) || (this.vat != null && !this.vat.equals(other.vat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.bootcamp.entities.Students[ vat=" + vat + " ]";
    }
    
}
