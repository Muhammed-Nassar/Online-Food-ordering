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
public class AdminUserBean {
    
     private String username;
     private String password;
     private byte active;

    public AdminUserBean() {
    }

    public AdminUserBean( String username, String password) {
        
        this.username = username;
        this.password = password;
        
    }

   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
