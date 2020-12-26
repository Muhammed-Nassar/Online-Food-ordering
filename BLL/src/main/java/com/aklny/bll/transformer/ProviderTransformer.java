/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.BranchBean;
import com.aklny.common.bean.ProviderBean;
import com.aklny.dal.entity.BranchEntity;
import com.aklny.dal.entity.ProviderEntity;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ProviderTransformer implements CommonTransformer<ProviderEntity, ProviderBean>{
    @Autowired        
    BranchTransformer branchTranformer;

    @Override
    public ProviderBean fromEntityToBean(ProviderEntity entity, String lang) {
        ProviderBean providerBean= new ProviderBean();
        providerBean.setId(entity.getId());
        providerBean.setNameAr(entity.getNameAr());
        providerBean.setNameEn(entity.getNameEn());
        providerBean.setHotline(entity.getHotline());
        providerBean.setLogoPathAr(entity.getLogoPathAr());
        providerBean.setLogoPathEn(entity.getLogoPathEn());
        return providerBean;
    }
   
    @Override
    public ProviderEntity fromBeanToEntity(ProviderBean bean) {
        ProviderEntity providerEntity= new ProviderEntity();
        providerEntity.setId(bean.getId());
        providerEntity.setNameAr(bean.getNameAr());
        providerEntity.setNameEn(bean.getNameEn());
        providerEntity.setHotline(bean.getHotline());
        providerEntity.setLogoPathAr(bean.getLogoPathAr());
        providerEntity.setLogoPathEn(bean.getLogoPathEn());
        return providerEntity;
        
    }
    
     public ProviderBean fromEntityToBeanWithBranches(ProviderEntity entity, String lang) {
        ProviderBean providerBean=fromEntityToBean(entity, lang);
        providerBean.setBranchesList(new ArrayList<>());
        entity.getBranches().stream().map((iBranchEntity) -> branchTranformer.fromEntityToBean(iBranchEntity, "")).forEachOrdered((branchBean) -> {
            providerBean.getBranchesList().add(branchBean);
        });
        return providerBean;
    }

    public BranchTransformer getBranchTranformer() {
        return branchTranformer;
    }

    public void setBranchTranformer(BranchTransformer branchTranformer) {
        this.branchTranformer = branchTranformer;
    }
    
}
