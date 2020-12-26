/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.DeliveryZoneEntity;
import com.aklny.dal.repo.DeliveryZoneRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class DeliveryZoneRepoImpl extends AbstractEntityRepo<DeliveryZoneEntity> implements DeliveryZoneRepo{

    public DeliveryZoneRepoImpl() {
        super(DeliveryZoneEntity.class);
    }
    
    
}
