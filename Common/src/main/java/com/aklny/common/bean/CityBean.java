/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class CityBean {
     private Integer id;
     private String nameAr;
     private String nameEn;
     private String name;
     private List<ZoneBean> areas;

    public CityBean() {
    }

    public CityBean(String nameAr, String nameEn) {
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    }

    public CityBean(Integer id, String nameAr, String nameEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ZoneBean> getAreas() {
        return areas;
    }

    public void setAreas(List<ZoneBean> areas) {
        this.areas = areas;
    }
     
    
}
