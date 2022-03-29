package com.example.springbootjpa.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class role extends  base{
    @Column
    private  String code;
    @Column
    private  String role;

    //    @ManyToMany(mappedBy = "roles")
//    private List<user> user = new ArrayList<>();
//    @OneToMany(mappedBy = "role")
//    private List<user> user= new ArrayList<>();
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
