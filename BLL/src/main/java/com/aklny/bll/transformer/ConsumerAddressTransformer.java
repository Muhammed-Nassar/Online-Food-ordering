/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.ConsumerBean;
import com.aklny.dal.entity.ConsumerEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ConsumerAddressTransformer implements CommonTransformer<ConsumerEntity, ConsumerBean>{

    @Override
    public ConsumerBean fromEntityToBean(ConsumerEntity entity, String lang) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ConsumerEntity fromBeanToEntity(ConsumerBean bean) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
