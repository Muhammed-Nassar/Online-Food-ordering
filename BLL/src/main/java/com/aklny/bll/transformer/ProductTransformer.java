/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.ProductBean;
import com.aklny.dal.entity.ProductEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ProductTransformer implements CommonTransformer<ProductEntity, ProductBean>{

    @Override
    public ProductBean fromEntityToBean(ProductEntity entity, String lang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductEntity fromBeanToEntity(ProductBean bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
