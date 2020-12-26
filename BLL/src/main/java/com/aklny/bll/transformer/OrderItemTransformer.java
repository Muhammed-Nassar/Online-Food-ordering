/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.OrderItemBean;
import com.aklny.dal.entity.OrderItemEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class OrderItemTransformer implements CommonTransformer<OrderItemEntity, OrderItemBean>{

    @Override
    public OrderItemBean fromEntityToBean(OrderItemEntity entity, String lang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrderItemEntity fromBeanToEntity(OrderItemBean bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
