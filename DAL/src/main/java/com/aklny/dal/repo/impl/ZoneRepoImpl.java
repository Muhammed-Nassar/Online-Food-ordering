/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.ZoneEntity;
import com.aklny.dal.repo.ZoneRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class ZoneRepoImpl extends AbstractEntityRepo<ZoneEntity> implements ZoneRepo{

    public ZoneRepoImpl() {
        super(ZoneEntity.class);
    }
    

}
