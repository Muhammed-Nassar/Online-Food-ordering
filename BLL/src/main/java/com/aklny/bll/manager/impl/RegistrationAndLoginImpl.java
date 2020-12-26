/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager.impl;

import static com.aklny.dal.DBConnectionManager.*;
import com.aklny.bll.manager.RegistrationAndLoginManager;
import com.aklny.bll.transformer.AdminUserTransformer;
import com.aklny.common.bean.AdminUserBean;
import com.aklny.common.bean.ConsumerBean;
import com.aklny.common.constant.CommonConstant;
import com.aklny.dal.entity.AdminUserEntity;
import com.aklny.dal.repo.AdminUserRepo;
import com.aklny.dal.repo.impl.AdminUserRepoImpl;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 4G
 */
@Service
@EnableTransactionManagement
public class RegistrationAndLoginImpl implements RegistrationAndLoginManager {

    @Autowired
    private AdminUserTransformer adminUserTransformer;
    @Autowired
    private AdminUserRepo adminUserRepo;

    @Transactional
    @Override
    public AdminUserBean registerAsAdmin(AdminUserBean adminUserBean) {
        AdminUserEntity transformedEntity = adminUserTransformer.fromBeanToEntity(adminUserBean);
        adminUserRepo.add(transformedEntity);
        AdminUserBean transformedBean = adminUserTransformer.fromEntityToBean(transformedEntity, CommonConstant.LANG_EN);
        return transformedBean;
    }

    @Override
    public AdminUserBean loginAsAdmin(AdminUserBean adminUserBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ConsumerBean registerAsConsumer(ConsumerBean consumerBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ConsumerBean loginAsConsumer(ConsumerBean consumerBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
//<editor-fold desc="ETTERS & GETTERS">

    public AdminUserTransformer getAdminUserTransformer() {
        return adminUserTransformer;
    }

    public void setAdminUserTransformer(AdminUserTransformer adminUserTransformer) {
        this.adminUserTransformer = adminUserTransformer;
    }

    public AdminUserRepo getAdminUserRepo() {
        return adminUserRepo;
    }

    public void setAdminUserRepo(AdminUserRepo adminUserRepo) {
        this.adminUserRepo = adminUserRepo;
    }
//</editor-fold>

}
