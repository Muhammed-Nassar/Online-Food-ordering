/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.DeliveryZoneBean;
import com.aklny.dal.entity.DeliveryZoneEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class DeliveryZoneTransformer implements CommonTransformer<DeliveryZoneEntity, DeliveryZoneBean>{

    @Override
    public DeliveryZoneBean fromEntityToBean(DeliveryZoneEntity entity, String lang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DeliveryZoneEntity fromBeanToEntity(DeliveryZoneBean bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
