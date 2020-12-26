/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.ProviderUserBean;
import com.aklny.dal.entity.ProviderUserEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ProviderUserTransformer implements CommonTransformer<ProviderUserEntity, ProviderUserBean>{

    @Override
    public ProviderUserBean fromEntityToBean(ProviderUserEntity entity, String lang) {
     ProviderUserBean providerUserBean= new ProviderUserBean();
     providerUserBean.setId(entity.getId());
     providerUserBean.setUserName(entity.getUsername());
     providerUserBean.setPassword(entity.getPassword());
     providerUserBean.setActive(entity.getActive());
     return providerUserBean;
    }

    @Override
    public ProviderUserEntity fromBeanToEntity(ProviderUserBean bean) {
        ProviderUserEntity providerUserEntity = new ProviderUserEntity();
         providerUserEntity.setId(bean.getId());
     providerUserEntity.setUsername(bean.getUserName());
     providerUserEntity.setPassword(bean.getPassword());
     providerUserEntity.setActive(bean.getActive());
     return providerUserEntity;
        
    }
    
}
