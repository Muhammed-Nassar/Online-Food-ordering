/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.OrderBean;
import com.aklny.dal.entity.OrderEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class OrderTransformer implements CommonTransformer<OrderEntity, OrderBean>{

    @Override
    public OrderBean fromEntityToBean(OrderEntity entity, String lang) {
       OrderBean orderBean = new OrderBean();
       orderBean.setId(entity.getId());
       orderBean.setOrderAt(entity.getOrderAt());
       orderBean.setDeliveryFees(entity.getDeliveryFees());
       orderBean.setStatus(entity.getStatus());
       return orderBean;
    }

    @Override
    public OrderEntity fromBeanToEntity(OrderBean bean) {
      OrderEntity orderEntity= new OrderEntity();
      orderEntity.setId(bean.getId());
      orderEntity.setOrderAt(bean.getOrderAt());
      orderEntity.setDeliveryFees(bean.getDeliveryFees());
      orderEntity.setStatus(bean.getStatus());
     return orderEntity;
    }
    
    
}
