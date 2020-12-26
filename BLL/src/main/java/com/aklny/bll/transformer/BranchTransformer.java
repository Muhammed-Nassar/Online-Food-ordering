/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.BranchBean;
import com.aklny.dal.entity.BranchEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class BranchTransformer implements CommonTransformer<BranchEntity, BranchBean> {

    @Autowired
    ProviderTransformer providerTransformer;
    @Autowired
    ZoneTransformer zoneTransformer;

    @Override
    public BranchBean fromEntityToBean(BranchEntity entity, String lang) {
        BranchBean branchBean = new BranchBean();
        branchBean.setId(entity.getId());
        branchBean.setNameAr(entity.getNameAr());
        branchBean.setNameEn(entity.getNameEn());
        branchBean.setPhone(entity.getPhone());
        branchBean.setProvider(providerTransformer.fromEntityToBean(entity.getProvider(), ""));
        branchBean.setArea(zoneTransformer.fromEntityToBeanWithCity(entity.getZone(), ""));

        return branchBean;
    }

    @Override
    public BranchEntity fromBeanToEntity(BranchBean bean) {
        BranchEntity branchEntity = new BranchEntity();
        branchEntity.setId(bean.getId());
        branchEntity.setNameAr(bean.getNameAr());
        branchEntity.setNameEn(bean.getNameEn());
        branchEntity.setPhone(bean.getPhone());
        branchEntity.setProvider(providerTransformer.fromBeanToEntity(bean.getProvider()));
        branchEntity.setZone(zoneTransformer.fromBeanToEntity(bean.getArea()));
        return branchEntity;
    }

    public ProviderTransformer getProviderTransformer() {
        return providerTransformer;
    }

    public void setProviderTransformer(ProviderTransformer providerTransformer) {
        this.providerTransformer = providerTransformer;
    }

    public ZoneTransformer getZoneTransformer() {
        return zoneTransformer;
    }

    public void setZoneTransformer(ZoneTransformer zoneTransformer) {
        this.zoneTransformer = zoneTransformer;
    }

    
}
