/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.dal.repo.impl;

import com.aklny.dal.entity.OrderItemEntity;
import com.aklny.dal.repo.OrderItemRepo;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 4G
 */
@Repository
public class OrderItemRepoImpl extends AbstractEntityRepo<OrderItemEntity> implements OrderItemRepo{

    public OrderItemRepoImpl() {
        super(OrderItemEntity.class);
    }

}
