/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll;

import com.aklny.bll.manager.AdminManager;
import com.aklny.bll.manager.LookupsManager;
import com.aklny.bll.manager.RegistrationAndLoginManager;
import com.aklny.bll.manager.impl.AdminManagerImpl;
import com.aklny.bll.manager.impl.LookupsManagerImpl;
import com.aklny.bll.manager.impl.RegistrationAndLoginImpl;
import com.aklny.common.bean.AdminUserBean;
import com.aklny.common.bean.BranchBean;
import com.aklny.common.bean.CityBean;
import com.aklny.common.bean.ConsumerBean;
import com.aklny.common.bean.ProviderBean;
import com.aklny.common.bean.ProviderUserBean;
import com.aklny.common.bean.ZoneBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 4G
 */
// Aklny BLL Gateway :Entry point of BLL and can holds all features as a repository
// Create objects of managers impls with interface reference 
// Create delegte methods based on  manager's methods 
@Service
@EnableTransactionManagement
public class Delegate {

    @Autowired
    AdminManager adminManager;
    @Autowired
    LookupsManager lookupsManager;
    @Autowired
    RegistrationAndLoginManager registrationAndLoginManager;

    //Admin Manager Delegate Methods -------------------------------------------*
    public ProviderBean addProvider(ProviderBean providerBean) {
        return adminManager.addProvider(providerBean);
    }

    public ProviderBean updateProvider(ProviderBean providerBean) {
        return adminManager.updateProvider(providerBean);
    }

    public void removeProvider(Integer id) {
        adminManager.removeProvider(id);
    }

    public ProviderBean findByIdProvider(Integer id) {
        return adminManager.findByIdProvider(id);
    }

    public List<ProviderBean> findListProvider() {
        return adminManager.findListProvider();
    }

    public List<ProviderBean> searchProvider() {
        return adminManager.searchProvider();
    }

    public BranchBean addBranch(BranchBean branchBean) {
        return adminManager.addBranch(branchBean);
    }

    public BranchBean updateBranch(BranchBean branchBean) {
        return adminManager.updateBranch(branchBean);
    }

    public void removeBranch(Integer id) {
        adminManager.removeBranch(id);
    }

    public BranchBean findByIdBranch(Integer id) {
        return adminManager.findByIdBranch(id);
    }

    public List<BranchBean> findListBranch() {
        return adminManager.findListBranch();
    }

    public List<BranchBean> search(String pattern) {
        return adminManager.search(pattern);
    }

    public ProviderUserBean addProviderUser(ProviderUserBean providerUserBean) {
        return adminManager.addProviderUser(providerUserBean);
    }

    public ProviderUserBean updateProviderUser(ProviderUserBean providerUserBean) {
        return adminManager.updateProviderUser(providerUserBean);
    }

    public void removeProviderUser(Integer id) {
        adminManager.removeProviderUser(id);
    }

    public ProviderUserBean findByIdProviderUser(Integer id) {
        return adminManager.findByIdProviderUser(id);
    }

    public List<ProviderBean> findListProviderUser() {
        return adminManager.findListProviderUser();
    }
    // LookUps Delegate Methods------------------------------------------------------------------------* 

    public CityBean addCity(CityBean cityBean) {
        return lookupsManager.addCity(cityBean);
    }

    public CityBean updateCity(CityBean cityBean) {
        return lookupsManager.updateCity(cityBean);
    }

    public void removeCity(Integer id) {
        lookupsManager.removeCity(id);
    }

    public CityBean findByIdCity(Integer id) {
        return lookupsManager.findByIdCity(id);
    }

    public List<CityBean> findListCity() {
        return lookupsManager.findListCity();
    }

    public ZoneBean addZone(ZoneBean zoneBean) {
        return lookupsManager.addZone(zoneBean);
    }

    public ZoneBean updateZone(ZoneBean ZoneBean) {
        return lookupsManager.updateZone(ZoneBean);
    }

    public void removeZone(Integer id) {
        lookupsManager.removeZone(id);
    }

    public ZoneBean findByIdZone(Integer id) {
        return lookupsManager.findByIdZone(id);
    }

    public List<ZoneBean> findListZone() {
        return lookupsManager.findListZone();
    }

    // Restration and login Delegate Methods ---------------------------------------------------------*
    public AdminUserBean registerAsAdmin(AdminUserBean adminUserBean) {
        return registrationAndLoginManager.registerAsAdmin(adminUserBean);
    }

    public AdminUserBean loginAsAdmin(AdminUserBean adminUserBean) {
        return registrationAndLoginManager.loginAsAdmin(adminUserBean);
    }

    public ConsumerBean registerAsConsumer(ConsumerBean consumerBean) {
        return registrationAndLoginManager.registerAsConsumer(consumerBean);
    }

    public ConsumerBean loginAsConsumer(ConsumerBean consumerBean) {
        return registrationAndLoginManager.loginAsConsumer(consumerBean);
    }
//<editor-fold desc="SETTERS & GETTERS ">


    public AdminManager getAdminManager() {
        return adminManager;
    }

    public void setAdminManager(AdminManager adminManager) {
        this.adminManager = adminManager;
    }

    public LookupsManager getLookupsManager() {
        return lookupsManager;
    }

    public void setLookupsManager(LookupsManager lookupsManager) {
        this.lookupsManager = lookupsManager;
    }

    public RegistrationAndLoginManager getRegistrationAndLoginManager() {
        return registrationAndLoginManager;
    }

    public void setRegistrationAndLoginManager(RegistrationAndLoginManager registrationAndLoginManager) {
        this.registrationAndLoginManager = registrationAndLoginManager;
    }
    //</editor-fold>

}
