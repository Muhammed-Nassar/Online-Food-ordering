/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ProductBean {
     private Integer id;
     private String nameAr;
     private String nameEn;
     private float price;
     private byte active;
     private String imagePath;
     private String decriptionAr;
     private String descriptionEn;
     private CategoryBean category;

    public ProductBean() {
    }

    public ProductBean(Integer id, String nameAr, String nameEn, float price, byte active, String imagePath, String decriptionAr, String descriptionEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.price = price;
        this.active = active;
        this.imagePath = imagePath;
        this.decriptionAr = decriptionAr;
        this.descriptionEn = descriptionEn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDecriptionAr() {
        return decriptionAr;
    }

    public void setDecriptionAr(String decriptionAr) {
        this.decriptionAr = decriptionAr;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }
     
    
}
