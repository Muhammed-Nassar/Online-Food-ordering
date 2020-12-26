/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import java.util.Date;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class OrderBean {

    private Integer id;
    private Date orderAt;
    private float deliveryFees;
    private String status;

    public OrderBean() {
    }

    public OrderBean(Integer id, Date orderAt, float deliveryFees, String status) {
        this.id = id;
        this.orderAt = orderAt;
        this.deliveryFees = deliveryFees;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public float getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
