/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.CategoryEntity;
import com.aklny.dal.repo.CategoryRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class CategoryRepoImpl extends AbstractEntityRepo<CategoryEntity> implements CategoryRepo{

    public CategoryRepoImpl() {
        super(CategoryEntity.class);
    }
    
    

}
