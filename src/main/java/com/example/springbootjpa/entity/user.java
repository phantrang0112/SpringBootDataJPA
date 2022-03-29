package com.example.springbootjpa.entity;

import javax.persistence.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user")
public class user extends base {
    @ManyToOne
    @JoinColumn(name="role_id")//tên để trong bảng user
    private role role = new role();
    private  String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.example.springbootjpa.entity.role getRole() {
        return role;
    }

    public void setRole(com.example.springbootjpa.entity.role role) {
        this.role = role;
    }


//    @ManyToMany
//    @JoinTable(name = "role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private List<role> role= new ArrayList<role>();
}
