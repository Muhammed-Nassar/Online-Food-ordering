/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal;

import com.aklny.dal.entity.ProviderEntity;
import com.aklny.dal.repo.ProviderRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Nassar
 */
@Component
public class TestClass {
    
    @Transactional 
    public void testFun(ApplicationContext applicationContext){
        try{
        ProviderRepo bean = applicationContext.getBean("providerRepoImpl", ProviderRepo.class);
//        ProviderEntity bean1 = applicationContext.getBean("providerEntity",ProviderEntity.class);
        ProviderEntity bean1 = new ProviderEntity();
        bean1.setNameAr("TESTnew");
        bean1.setNameEn("Testnew");
        ProviderEntity add = bean.add(bean1);
        System.out.println("Begin added | "+add.getId());
        }catch(Exception e ){
            System.out.println(e.getMessage());}
    }
    
}
