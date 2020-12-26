/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager.impl;

import com.aklny.bll.manager.AdminManager;
import com.aklny.bll.transformer.AdminUserTransformer;
import com.aklny.bll.transformer.BranchTransformer;
import com.aklny.bll.transformer.ProviderTransformer;
import com.aklny.bll.transformer.ProviderUserTransformer;
import com.aklny.common.bean.BranchBean;
import com.aklny.common.bean.ProviderBean;
import com.aklny.common.bean.ProviderUserBean;
import com.aklny.common.constant.CommonConstant;
import com.aklny.dal.repo.impl.BranchRepoImpl;
import com.aklny.dal.repo.impl.ProviderRepoImpl;
import com.aklny.dal.repo.impl.ProviderUserRepoImpl;
import java.util.List;
import static com.aklny.dal.DBConnectionManager.*;
import com.aklny.dal.entity.BranchEntity;
import com.aklny.dal.entity.ProviderEntity;
import com.aklny.dal.entity.ProviderUserEntity;
import com.aklny.dal.repo.BranchRepo;
import com.aklny.dal.repo.ProviderRepo;
import com.aklny.dal.repo.ProviderUserRepo;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 4G
 */
@EnableTransactionManagement
@Service
public class AdminManagerImpl implements AdminManager {

    @Autowired
    private ProviderTransformer providerTransformer;
    @Autowired
    private BranchTransformer branchTransformer;
    @Autowired
    private ProviderUserTransformer providerUserTransformer;
    @Autowired
    private ProviderRepo providerRepo;
    @Autowired
    private BranchRepo branchRepo;
    @Autowired
    private ProviderUserRepo providerUserRepo;
   

    @Transactional
    @Override
    public ProviderBean addProvider(ProviderBean providerBean) {
//        
        ProviderEntity transformedEntity = providerTransformer.fromBeanToEntity(providerBean);
        providerRepo.add(transformedEntity);
        return providerTransformer.fromEntityToBean(transformedEntity, CommonConstant.LANG_AR);

    }
//    public ProviderBean addProvider(ProviderBean providerBean) {
//        ProviderBean transformedBean = null;
//        try {
//            openSession();
//            ProviderEntity transformedEntity = providerTransformer.fromBeanToEntity(providerBean);
//            beginTransaction();
//            providerRepo.add(transformedEntity);
//            transformedBean = providerTransformer.fromEntityToBean(transformedEntity, CommonConstant.LANG_AR);
//            commitTransaction();
//        } catch (Exception e) {
//            rollbackTransaction();
//            throw e;
//        } finally {
//            closeSession();
//        }
//        return transformedBean;
//    }

    @Transactional
    @Override
    public ProviderBean updateProvider(ProviderBean providerBean) {
        ProviderEntity transformedEntity = providerTransformer.fromBeanToEntity(providerBean);
        providerRepo.update(transformedEntity);
        return providerTransformer.fromEntityToBean(transformedEntity, CommonConstant.LANG_AR);

    }

    @Transactional
    @Override
    public void removeProvider(Integer id) {
        providerRepo.remove(id);
        commitTransaction();
    }

    @Transactional
    @Override
    public ProviderBean findByIdProvider(Integer id) {

        return providerTransformer.fromEntityToBeanWithBranches(providerRepo.findById(id), "");
    }

    @Transactional
    @Override
    public List<ProviderBean> findListProvider() {
        List<ProviderBean> providerBeanList;

        providerBeanList = new ArrayList<>();
        List<ProviderEntity> providerEntityList = providerRepo.findList();
        for (ProviderEntity iProviderEntity : providerEntityList) {
            ProviderBean providerBean = providerTransformer.fromEntityToBean(iProviderEntity, CommonConstant.LANG_EN);
            providerBeanList.add(providerBean);
        }

        return providerBeanList;
    }

    @Transactional
    @Override
    public List<ProviderBean> searchProvider() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    @Override
    public BranchBean addBranch(BranchBean branchBean) {

        BranchEntity addedEntity = branchRepo.add(branchTransformer.fromBeanToEntity(branchBean));
        return branchTransformer.fromEntityToBean(addedEntity, "");

    }

    @Transactional
    @Override
    public BranchBean updateBranch(BranchBean branchBean) {

        BranchEntity updatedEntity = branchRepo.update(branchTransformer.fromBeanToEntity(branchBean));
        return branchTransformer.fromEntityToBean(updatedEntity, "");

    }

    @Transactional
    @Override
    public void removeBranch(Integer id) {

        branchRepo.remove(id);

    }

    @Transactional
    @Override
    public BranchBean findByIdBranch(Integer id) {

        BranchEntity findedEntity = branchRepo.findById(id);
        return branchTransformer.fromEntityToBean(findedEntity, "");

    }

    @Transactional
    @Override
    public List<BranchBean> findListBranch() {
        List<BranchBean> branchesBeanList;

        branchesBeanList = new ArrayList<>();

        List<BranchEntity> branchesEntityList = branchRepo.findList();
        for (BranchEntity iBranchEntity : branchesEntityList) {
            branchesBeanList.add(branchTransformer.fromEntityToBean(iBranchEntity, ""));
        }

        return branchesBeanList;
    }

    @Transactional
    @Override
    public List<BranchBean> search(String pattern) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
//////--------------------------------------------------------------------- Provider User

    @Transactional
    @Override
    public ProviderUserBean addProviderUser(ProviderUserBean providerUserBean) {
        ProviderUserBean addedBean = null;
        try {
            openSession();
            beginTransaction();

        } catch (Exception e) {
        }
        return addedBean;
    }

    @Transactional
    @Override
    public ProviderUserBean updateProviderUser(ProviderUserBean providerUserBean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Transactional
    @Override
    public void removeProviderUser(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public ProviderUserBean findByIdProviderUser(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public List<ProviderBean> findListProviderUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//<editor-fold  desc="GETTER&SETTERS">
   
    public ProviderTransformer getProviderTransformer() {
        return providerTransformer;
    }

    public void setProviderTransformer(ProviderTransformer providerTransformer) {
        this.providerTransformer = providerTransformer;
    }

    public BranchTransformer getBranchTransformer() {
        return branchTransformer;
    }

    public void setBranchTransformer(BranchTransformer branchTransformer) {
        this.branchTransformer = branchTransformer;
    }

    public ProviderUserTransformer getProviderUserTransformer() {
        return providerUserTransformer;
    }

    public void setProviderUserTransformer(ProviderUserTransformer providerUserTransformer) {
        this.providerUserTransformer = providerUserTransformer;
    }

    public ProviderRepo getProviderRepo() {
        return providerRepo;
    }

    public void setProviderRepo(ProviderRepo providerRepo) {
        this.providerRepo = providerRepo;
    }

    public BranchRepo getBranchRepo() {
        return branchRepo;
    }

    public void setBranchRepo(BranchRepo branchRepo) {
        this.branchRepo = branchRepo;
    }

    public ProviderUserRepo getProviderUserRepo() {
        return providerUserRepo;
    }

    public void setProviderUserRepo(ProviderUserRepo providerUserRepo) {
        this.providerUserRepo = providerUserRepo;
    } 
// </editor-fold>
    
}
