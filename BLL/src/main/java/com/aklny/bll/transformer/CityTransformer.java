/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

import com.aklny.common.bean.CityBean;
import com.aklny.common.bean.ZoneBean;
import com.aklny.common.constant.CommonConstant;
import com.aklny.dal.entity.CityEntity;
import com.aklny.dal.entity.ZoneEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class CityTransformer implements CommonTransformer<CityEntity, CityBean> {

    @Autowired
    ZoneTransformer zoneTransformer ;

    @Override
    public CityBean fromEntityToBean(CityEntity entity, String lang) {
        CityBean cityBean = new CityBean();
        cityBean.setId(entity.getId());
        cityBean.setNameAr(entity.getNameAr());
        cityBean.setNameEn(entity.getNameEn());
        if (CommonConstant.LANG_AR == lang) {
            cityBean.setName(entity.getNameAr());
        }
        cityBean.setName(entity.getNameEn());
        return cityBean;
    }

    @Override
    public CityEntity fromBeanToEntity(CityBean bean) {
        CityEntity cityEntity = new CityEntity();
        cityEntity.setId(bean.getId());
        cityEntity.setNameAr(bean.getNameAr());
        cityEntity.setNameEn(bean.getNameEn());
        return cityEntity;
    }
    
     public CityBean fromEntityToBeanWithAreas(CityEntity entity, String lang) {
        CityBean cityBean = fromEntityToBean(entity, lang);
        cityBean.setAreas(new ArrayList<>());
        for (ZoneEntity zoneEntity : entity.getZones()) {
            ZoneBean zoneBean = zoneTransformer.fromEntityToBean(zoneEntity, "");
            cityBean.getAreas().add(zoneBean);
        }
        return cityBean;
    }

    public ZoneTransformer getZoneTransformer() {
        return zoneTransformer;
    }

    public void setZoneTransformer(ZoneTransformer zoneTransformer) {
        this.zoneTransformer = zoneTransformer;
    }

}
