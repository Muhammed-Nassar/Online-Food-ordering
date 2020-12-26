/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.CategoryBean;
import com.aklny.dal.entity.CategoryEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class CategoryTransformer implements CommonTransformer<CategoryEntity, CategoryBean>{

    @Override
    public CategoryBean fromEntityToBean(CategoryEntity entity, String lang) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CategoryEntity fromBeanToEntity(CategoryBean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
