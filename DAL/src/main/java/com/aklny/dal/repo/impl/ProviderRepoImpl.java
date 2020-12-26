/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.ProviderEntity;
import com.aklny.dal.repo.ProviderRepo;
import org.springframework.stereotype.Repository;
@Repository
public class ProviderRepoImpl extends AbstractEntityRepo<ProviderEntity> implements ProviderRepo {

    public ProviderRepoImpl() {
        super(ProviderEntity.class);
    }

}
