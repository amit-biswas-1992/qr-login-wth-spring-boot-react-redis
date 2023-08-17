package com.qrlogin.Model;

import javax.persistence.Entity;

@Entity
public class User {
    private String id;
    private String username;
    private String phone;
    
    
    public User() {
        
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}
