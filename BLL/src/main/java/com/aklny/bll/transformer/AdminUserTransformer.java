/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.AdminUserBean;
import com.aklny.dal.entity.AdminUserEntity;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class AdminUserTransformer implements CommonTransformer<AdminUserEntity, AdminUserBean> {

    @Override
    public AdminUserBean fromEntityToBean(AdminUserEntity entity, String lang) {
        AdminUserBean bean = new AdminUserBean();
        bean.setUsername(entity.getUsername());
        bean.setPassword(entity.getPassword());

        return bean;
    }

    @Override
    public AdminUserEntity fromBeanToEntity(AdminUserBean bean) {
        AdminUserEntity entity = new AdminUserEntity();
        entity.setUsername(bean.getUsername());
        entity.setPassword(bean.getPassword());
        return entity;
    }

}
