package com.example.springbootjpa.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="createBy")
    private  String createBy;
    private Date createDate;
    private String modifileBy;
    private String modifileDate;
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




    public Long getId() {
        return id;
    }
}
