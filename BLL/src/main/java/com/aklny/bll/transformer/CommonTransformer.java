/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.bll.transformer;

/**
 *
 * @author 4G
 */
public interface CommonTransformer<E , B> {

    public B fromEntityToBean(E entity, String lang);

    public E fromBeanToEntity(B bean);

}
