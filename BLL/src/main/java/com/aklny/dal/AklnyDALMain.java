/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.aklny.dal.DBConnectionManager.*;
import com.aklny.dal.entity.CityEntity;
import com.aklny.dal.entity.ConsumerEntity;
import com.aklny.dal.entity.ConsumerAddressEntity;
import com.aklny.dal.entity.ProviderEntity;
import com.aklny.dal.repo.ProviderRepo;
import com.aklny.dal.repo.impl.CityRepoImpl;
import com.aklny.dal.repo.impl.ConsumerAddressRepoImpl;
import com.aklny.dal.repo.impl.ProviderRepoImpl;
import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 4G
 */
public class AklnyDALMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
        TestClass bean = applicationContext.getBean("testClass",TestClass.class);
        bean.testFun(applicationContext);
//        ProviderRepo bean = applicationContext.getBean("providerRepoImpl", ProviderRepo.class);
////        ProviderEntity bean1 = applicationContext.getBean("providerEntity",ProviderEntity.class);
//        ProviderEntity bean1 = new ProviderEntity();
//        bean1.setNameAr("بو احمد");
//        bean1.setNameEn("abo ahmed");
//        ProviderEntity add = bean.add(bean1);
//        System.out.println("Begin added | "+add.getId());
//        try (Session session = openSession()) {
//            beginTransaction();
//             ProviderRepoImpl c =new ProviderRepoImpl(ProviderEntity.class);
//            ProviderEntity add = bean.add(bean1);
//            System.out.println(add.getNameEn() + "Added ");
        // Integer intg = new Integer(1);
//            c.remove(4);
//             List<ProviderEntity>  list =bean.findList();
//             list.forEach((provider) -> {
//                 System.out.println(provider.getNameEn());
////            });
//            System.out.println(" Inside Transaction ");
//            commitTransaction();
//            System.out.println("After commition ");
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//
//            if (isActiveTransaction()) {
//                rollbackTransaction();
//                System.out.println(" After rollback ");
//
//            }

//        }
    }

}
