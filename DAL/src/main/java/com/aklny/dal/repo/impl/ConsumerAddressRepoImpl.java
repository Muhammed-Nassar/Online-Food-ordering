/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.ConsumerAddressEntity;
import com.aklny.dal.repo.ConsumerAddressRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class ConsumerAddressRepoImpl extends AbstractEntityRepo<ConsumerAddressEntity> implements ConsumerAddressRepo{

    public ConsumerAddressRepoImpl() {
        super(ConsumerAddressEntity.class);
    }

}
