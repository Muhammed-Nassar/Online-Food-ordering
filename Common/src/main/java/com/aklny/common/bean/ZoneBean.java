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
public class ZoneBean {

    private Integer id;
    private String nameAr;
    private String nameEn;
    private String name;
    private CityBean cityBean;
    private List<BranchBean> branches;
            

    public ZoneBean() {
    }

    public ZoneBean(Integer id, String nameAr, String nameEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
    } 

    public ZoneBean( Integer id,String nameAr, String nameEn, CityBean cityBean) {
        
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        
        this.cityBean = cityBean;
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

    public CityBean getCityBean() {
        return cityBean;
    }

    public void setCityBean(CityBean cityBean) {
        this.cityBean = cityBean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BranchBean> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchBean> branches) {
        this.branches = branches;
    }
    
}
