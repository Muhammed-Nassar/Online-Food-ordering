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
public class DeliveryZoneBean {
    private Integer id;
     private float deliveryFees;
     private int deliverInMinutes;

    public DeliveryZoneBean() {
    }

    public DeliveryZoneBean(Integer id, float deliveryFees, int deliverInMinutes) {
        this.id = id;
        this.deliveryFees = deliveryFees;
        this.deliverInMinutes = deliverInMinutes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getDeliveryFees() {
        return deliveryFees;
    }

    public void setDeliveryFees(float deliveryFees) {
        this.deliveryFees = deliveryFees;
    }

    public int getDeliverInMinutes() {
        return deliverInMinutes;
    }

    public void setDeliverInMinutes(int deliverInMinutes) {
        this.deliverInMinutes = deliverInMinutes;
    }
     
    
}
