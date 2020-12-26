/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aklny.common.bean;

import org.springframework.stereotype.Component;

/**
 *
 * @author 4G
 */
@Component
public class ProviderUserBean {

    private Integer id;
    private String userName;
    private String password;
    private byte active;
    

    public ProviderUserBean() {
    }

    public ProviderUserBean(Integer id, String username, String password, byte active) {
        this.id = id;
        this.userName = username;
        this.password = password;
        this.active = active;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
    

}
