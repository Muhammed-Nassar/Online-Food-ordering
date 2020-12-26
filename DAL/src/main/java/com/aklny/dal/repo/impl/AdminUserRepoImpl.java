/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.AdminUserEntity;
import com.aklny.dal.repo.AdminUserRepo;
import org.springframework.stereotype.Repository;

@Repository
public class AdminUserRepoImpl  extends AbstractEntityRepo<AdminUserEntity> implements AdminUserRepo{

    public AdminUserRepoImpl() {
        super(AdminUserEntity.class);

    }

}
