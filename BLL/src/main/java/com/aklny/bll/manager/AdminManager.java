/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager;

import com.aklny.common.bean.BranchBean;
import com.aklny.common.bean.ProviderBean;
import com.aklny.common.bean.ProviderUserBean;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author 4G
 */
@Service
public interface AdminManager {
    // Admin Features-----------------------------------
    
    //1.Provider features

    public ProviderBean addProvider(ProviderBean providerBean);

    public ProviderBean updateProvider(ProviderBean providerBean);

    public void removeProvider(Integer id);

    public ProviderBean findByIdProvider(Integer id);

    public List<ProviderBean> findListProvider();

    public List<ProviderBean> searchProvider();

    //2. Branches features
    public BranchBean addBranch(BranchBean branchBean);

    public BranchBean updateBranch(BranchBean branchBean);

    public void removeBranch(Integer id);

    public BranchBean findByIdBranch(Integer id);

    public List<BranchBean> findListBranch();

    public List<BranchBean> search(String pattern);

    //3.Users features
    public ProviderUserBean addProviderUser(ProviderUserBean providerUserBean);

    public ProviderUserBean updateProviderUser(ProviderUserBean providerUserBean);

    public void removeProviderUser(Integer id);

    public ProviderUserBean findByIdProviderUser(Integer id);

    public List<ProviderBean> findListProviderUser();
}