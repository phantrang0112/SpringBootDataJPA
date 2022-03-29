package com.example.springbootjpa.DTO;

import java.util.Date;

public class UserDTO {
    private String name;
    private Long roleId;
    private  String createBy;
    private Date createDate;
    private String modifileBy;
    private String modifileDate;
    private  Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModifileBy() {
        return modifileBy;
    }

    public void setModifileBy(String modifileBy) {
        this.modifileBy = modifileBy;
    }

    public String getModifileDate() {
        return modifileDate;
    }

    public void setModifileDate(String modifileDate) {
        this.modifileDate = modifileDate;
    }

    public void setName(String name) {
        this.name = name;
    }
}
