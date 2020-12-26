/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import java.math.BigDecimal;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ConsumerAddressBean {

    private Integer id;
    private String street;
    private String building;
    private String floor;
    private String flat;
    private byte active;
    private String landmark;
    private BigDecimal lat;
    private BigDecimal lng;
    private String label;

    public ConsumerAddressBean() {
    }

    public ConsumerAddressBean(Integer id, String street, String building, String floor, String flat, byte active, String landmark, BigDecimal lat, BigDecimal lng, String label) {
        this.id = id;
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.flat = flat;
        this.active = active;
        this.landmark = landmark;
        this.lat = lat;
        this.lng = lng;
        this.label = label;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
