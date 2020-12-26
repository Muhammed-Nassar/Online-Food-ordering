/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.OrderEntity;
import com.aklny.dal.repo.OrderRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class OrderRepoImpl extends AbstractEntityRepo<OrderEntity>  implements OrderRepo{

   
    public OrderRepoImpl() {
        super(OrderEntity.class);
    }

}
