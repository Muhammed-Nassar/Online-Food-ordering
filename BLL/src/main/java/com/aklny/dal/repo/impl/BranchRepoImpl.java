/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.BranchEntity;
import com.aklny.dal.repo.BranchRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class BranchRepoImpl extends AbstractEntityRepo<BranchEntity> implements BranchRepo{

    public BranchRepoImpl() {
        super(BranchEntity.class);
    }
    

}
