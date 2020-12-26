/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.ProviderUserEntity;
import com.aklny.dal.repo.ProviderUserRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class ProviderUserRepoImpl extends AbstractEntityRepo<ProviderUserEntity> implements ProviderUserRepo{

    public ProviderUserRepoImpl() {
        super(ProviderUserEntity.class);
    }

}
