/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager.impl;

import static com.aklny.dal.DBConnectionManager.*;
import com.aklny.bll.manager.LookupsManager;
import com.aklny.bll.transformer.CityTransformer;
import com.aklny.bll.transformer.ZoneTransformer;
import com.aklny.common.bean.CityBean;
import com.aklny.common.bean.ZoneBean;
import com.aklny.common.constant.CommonConstant;
import com.aklny.dal.entity.CityEntity;
import com.aklny.dal.entity.ZoneEntity;
import com.aklny.dal.repo.CityRepo;
import com.aklny.dal.repo.ZoneRepo;
import com.aklny.dal.repo.impl.CityRepoImpl;
import com.aklny.dal.repo.impl.ZoneRepoImpl;
import java.util.ArrayList;
import java.util.List;
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
public class LookupsManagerImpl implements LookupsManager {

    @Autowired
    CityRepo cityRepo;
    @Autowired
    ZoneRepo zoneRepo;
    @Autowired
    CityTransformer cityTranformer;
    @Autowired
    ZoneTransformer zoneTranformer;

    @Transactional
    @Override
    public CityBean addCity(CityBean cityBean) {
        CityEntity transformedEntity = cityTranformer.fromBeanToEntity(cityBean);
        CityEntity addedEntity = cityRepo.add(transformedEntity);
        return cityTranformer.fromEntityToBean(addedEntity, CommonConstant.LANG_EN);

    }

    @Transactional
    @Override
    public CityBean updateCity(CityBean cityBean) {

        CityEntity transformedEntity = cityTranformer.fromBeanToEntity(cityBean);
        CityEntity updatedEntity = cityRepo.update(transformedEntity);
        return cityTranformer.fromEntityToBean(updatedEntity, CommonConstant.LANG_EN);

    }

    @Transactional
    @Override
    public void removeCity(Integer id) {

        cityRepo.remove(id);
    }

    @Transactional
    @Override
    public CityBean findByIdCity(Integer id) {

        CityEntity findedEntity = cityRepo.findById(id);
        return cityTranformer.fromEntityToBeanWithAreas(findedEntity, CommonConstant.LANG_EN);

    }

    @Transactional
    @Override
    public List<CityBean> findListCity() {
        List<CityBean> cityBeanList = new ArrayList<>();
        List<CityEntity> cityEntityList = cityRepo.findList();
        cityEntityList.stream().map((cityEntityTemp) -> cityTranformer.fromEntityToBean(cityEntityTemp, CommonConstant.LANG_EN)).forEachOrdered((cityBean) -> {
            cityBeanList.add(cityBean);
        });//        List<CityEntity> cityEntityList = cityRepo.findList();
//        for (CityEntity cityEntityTemp : cityEntityList) {
//            CityBean cityBean = cityTranformer.fromEntityToBean(cityEntityTemp, CommonConstant.LANG_EN);
//            cityBeanList.add(cityBean);
//        }
        return cityBeanList;
    }

    @Transactional
    @Override
    public ZoneBean addZone(ZoneBean zoneBean) {

        ZoneEntity transformedEntity = zoneTranformer.fromBeanToEntity(zoneBean);
        ZoneEntity addedEntity = zoneRepo.add(transformedEntity);
        return zoneTranformer.fromEntityToBeanWithCity(addedEntity, CommonConstant.LANG_EN);

    }

    @Transactional
    @Override
    public ZoneBean updateZone(ZoneBean ZoneBean) {

        ZoneEntity transformedEntity = zoneTranformer.fromBeanToEntity(ZoneBean);
        beginTransaction();
        ZoneEntity updatedEntity = zoneRepo.update(transformedEntity);
        return zoneTranformer.fromEntityToBean(updatedEntity, CommonConstant.LANG_EN);
    }

    @Transactional
    @Override
    public void removeZone(Integer id) {
        zoneRepo.remove(id);
    }

    @Transactional
    @Override
    public ZoneBean findByIdZone(Integer id) {

        ZoneEntity findedEntity = zoneRepo.findById(id);
        return zoneTranformer.fromEntityToBean(findedEntity, CommonConstant.LANG_EN);

    }

    @Transactional
    @Override
    public List<ZoneBean> findListZone() {
        List<ZoneBean> zoneBeanList = new ArrayList<>();
        List<ZoneEntity> zoneEntityList = zoneRepo.findList();
        zoneEntityList.stream().map((zoneEntity) -> zoneTranformer.fromEntityToBean(zoneEntity, CommonConstant.LANG_EN)).forEachOrdered((zoneBean) -> {
            zoneBeanList.add(zoneBean);
        });

        return zoneBeanList;

    }
//<editor-fold  desc="SETTERS & GETTERS ">
   
    public CityRepo getCityRepo() {
        return cityRepo;
    }

    public void setCityRepo(CityRepo cityRepo) {
        this.cityRepo = cityRepo;
    }

    public ZoneRepo getZoneRepo() {
        return zoneRepo;
    }

    public void setZoneRepo(ZoneRepo zoneRepo) {
        this.zoneRepo = zoneRepo;
    }

    public CityTransformer getCityTranformer() {
        return cityTranformer;
    }

    public void setCityTranformer(CityTransformer cityTranformer) {
        this.cityTranformer = cityTranformer;
    }

    public ZoneTransformer getZoneTranformer() {
        return zoneTranformer;
    }

    public void setZoneTranformer(ZoneTransformer zoneTranformer) {
        this.zoneTranformer = zoneTranformer;
    }
}
//</editor-fold>