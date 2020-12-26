/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class BranchBean {
     private Integer id;
     private String nameAr;
     private String nameEn;
     private BigDecimal lat;
     private BigDecimal lng;
     private Date openAt;
     private Date closeAt;
     private String phone;
     private ProviderBean provider;
     private ZoneBean area;

    public ProviderBean getProvider() {
        return provider;
    }

    public void setProvider(ProviderBean provider) {
        this.provider = provider;
    }

    public BranchBean() {
    }

    public BranchBean(Integer id, String nameAr, String nameEn, BigDecimal lat, BigDecimal lng, Date openAt, Date closeAt, String phone) {
        this.id = id;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.lat = lat;
        this.lng = lng;
        this.openAt = openAt;
        this.closeAt = closeAt;
        this.phone = phone;
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

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public Date getOpenAt() {
        return openAt;
    }

    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
    }

    public Date getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ZoneBean getArea() {
        return area;
    }

    public void setArea(ZoneBean area) {
        this.area = area;
    }
     
}
