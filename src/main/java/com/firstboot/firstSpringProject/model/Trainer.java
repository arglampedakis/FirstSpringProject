/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firstboot.firstSpringProject.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author glamb
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findByTrId", query = "SELECT t FROM Trainer t WHERE t.trId = :trId"),
    @NamedQuery(name = "Trainer.findByTrName", query = "SELECT t FROM Trainer t WHERE t.trName = :trName"),
    @NamedQuery(name = "Trainer.findBySurname", query = "SELECT t FROM Trainer t WHERE t.surname = :surname"),
    @NamedQuery(name = "Trainer.findByAge", query = "SELECT t FROM Trainer t WHERE t.age = :age")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TR_ID")
    private Integer trId;
    @Basic(optional = false)
    @Column(name = "TR_NAME")
    private String trName;
    @Basic(optional = false)
    @Column(name = "SURNAME")
    private String surname;
    @Basic(optional = false)
    @Column(name = "AGE")
    private Integer age;

    public Trainer() {
    }

    public Trainer(Integer trId) {
        this.trId = trId;
    }

    public Trainer(Integer trId, String trName, String surname, Integer age) {
        this.trId = trId;
        this.trName = trName;
        this.surname = surname;
        this.age = age;
    }

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getTrName() {
        return trName;
    }

    public void setTrName(String trName) {
        this.trName = trName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trId != null ? trId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trId == null && other.trId != null) || (this.trId != null && !this.trId.equals(other.trId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.firstboot.firstSpringProject.model.Trainer[ trId=" + trId + " ]";
    }
    
}
