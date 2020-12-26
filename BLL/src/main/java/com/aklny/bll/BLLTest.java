/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll;

import com.aklny.common.bean.CityBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Nassar
 */
public class BLLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext appCon= new ClassPathXmlApplicationContext("bll-config.xml");
        Delegate del = appCon.getBean("delegate",Delegate.class);
        CityBean addCity = del.addCity(new CityBean("testAR3", "testEN3"));
        System.out.println("City id :" + addCity.getId());
    }
    
}
