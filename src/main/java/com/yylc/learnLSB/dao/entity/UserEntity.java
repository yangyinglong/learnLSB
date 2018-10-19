package com.yylc.learnLSB.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class UserEntity implements Serializable {

    @Id
    private String id;
    @Column
    private String userName;
    @Column
    private String phone;
    @Column
    private String password;
    @Column
    private Integer status;
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public UserEntity() {
    }

    public UserEntity(String id, String userName, String phone, String password, Integer status, String createdTime, String changedTime) {
        this.id = id;
        this.userName = userName;
        this.phone = phone;
        this.password = password;
        this.status = status;
        this.createdTime = createdTime;
        this.changedTime = changedTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(String changedTime) {
        this.changedTime = changedTime;
    }

}