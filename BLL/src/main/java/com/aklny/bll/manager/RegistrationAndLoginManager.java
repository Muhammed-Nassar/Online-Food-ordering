/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.manager;

import com.aklny.common.bean.AdminUserBean;
import com.aklny.common.bean.ConsumerBean;
import org.springframework.stereotype.Service;

/**
 *
 * @author 4G
 */
@Service
public interface RegistrationAndLoginManager {

    //Admin regitration and login
    public AdminUserBean registerAsAdmin(AdminUserBean adminUserBean);

    public AdminUserBean loginAsAdmin(AdminUserBean adminUserBean);

    //Admin regitration and login
    public ConsumerBean registerAsConsumer(ConsumerBean consumerBean);

    public ConsumerBean loginAsConsumer(ConsumerBean consumerBean);

}
