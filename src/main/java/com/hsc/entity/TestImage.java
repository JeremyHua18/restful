/*
 * Shopping System Based on Block Chain.
 * Copyright 2018 zhouxz.
 */
package com.hsc.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author zhouxz
 */
@Entity
@Table(name = "test_image")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TestImage.findAll", query = "SELECT t FROM TestImage t")
    , @NamedQuery(name = "TestImage.findById", query = "SELECT t FROM TestImage t WHERE t.id = :id")
    , @NamedQuery(name = "TestImage.findByName", query = "SELECT t FROM TestImage t WHERE t.name = :name")})
public class TestImage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
//    @Lob
//    @Column(name = "image")
//    private byte[] image;
    @Size(max = 99)
    @Column(name = "name")
    private String name;

    public TestImage() {
    }

    public TestImage(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public byte[] getImage() {
//        return image;
//    }
//
//    public void setImage(byte[] image) {
//        this.image = image;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestImage)) {
            return false;
        }
        TestImage other = (TestImage) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hsc.entity.TestImage[ id=" + id + " ]";
    }
    
}
