/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.ConsumerEntity;
import com.aklny.dal.repo.ConsumerRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class ConsumerRepoImpl extends AbstractEntityRepo<ConsumerEntity> implements ConsumerRepo{

    public ConsumerRepoImpl() {
        super(ConsumerEntity.class);
    }
    

}
