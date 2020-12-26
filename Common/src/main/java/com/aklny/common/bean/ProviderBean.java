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
public class ProviderBean {
    private Integer id;
     private String nameAr;
     private String nameEn;
     private String hotline;
     private String logoPathAr;
     private String logoPathEn;
     private List<BranchBean> branchesList;

    public ProviderBean() {
    }

    public ProviderBean(Integer id, String nameAr, String nameEn, String hotline, String logoPathAr, String logoPathEn) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.hotline = hotline;
        this.logoPathAr = logoPathAr;
        this.logoPathEn = logoPathEn;
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

    public String getHotline() {
        return hotline;
    }

    public void setHotline(String hotline) {
        this.hotline = hotline;
    }

    public String getLogoPathAr() {
        return logoPathAr;
    }

    public void setLogoPathAr(String logoPathAr) {
        this.logoPathAr = logoPathAr;
    }

    public String getLogoPathEn() {
        return logoPathEn;
    }

    public void setLogoPathEn(String logoPathEn) {
        this.logoPathEn = logoPathEn;
    }

    public List<BranchBean> getBranchesList() {
        return branchesList;
    }

    public void setBranchesList(List<BranchBean> branchesList) {
        this.branchesList = branchesList;
    }
     
    
}
