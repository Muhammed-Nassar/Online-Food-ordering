/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.ZoneBean;
import com.aklny.dal.entity.ZoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ZoneTransformer implements CommonTransformer<ZoneEntity, ZoneBean> {

    @Autowired
    private CityTransformer cityTransformer;

    @Override
    public ZoneBean fromEntityToBean(ZoneEntity entity, String lang) {
        ZoneBean zoneBean = new ZoneBean();
        zoneBean.setId(entity.getId());
        zoneBean.setNameAr(entity.getNameAr());
        zoneBean.setNameEn(entity.getNameEn());
        return zoneBean;
    }

    @Override
    public ZoneEntity fromBeanToEntity(ZoneBean bean) {
        ZoneEntity zoneEntity = new ZoneEntity();
        zoneEntity.setId(bean.getId());
        zoneEntity.setNameAr(bean.getNameAr());
        zoneEntity.setNameEn(bean.getNameEn());
        zoneEntity.setCity(cityTransformer.fromBeanToEntity(bean.getCityBean()));
        return zoneEntity;
    }

    public ZoneBean fromEntityToBeanWithCity(ZoneEntity entity, String lang) {
        ZoneBean zoneBean = fromEntityToBean(entity, "");
        zoneBean.setCityBean(cityTransformer.fromEntityToBean(entity.getCity(), ""));
        return zoneBean;
    }

    public ZoneBean fromEntityToBeanWithBranches(ZoneEntity entity, String lang) {
        ZoneBean zoneBean = new ZoneBean();
        zoneBean.setId(entity.getId());
        zoneBean.setNameAr(entity.getNameAr());
        zoneBean.setNameEn(entity.getNameEn());
        zoneBean.setCityBean(cityTransformer.fromEntityToBean(entity.getCity(), ""));
        return zoneBean;
    }

    public CityTransformer getCityTransformer() {
        return cityTransformer;
    }

    public void setCityTransformer(CityTransformer cityTransformer) {
        this.cityTransformer = cityTransformer;
    }

}
