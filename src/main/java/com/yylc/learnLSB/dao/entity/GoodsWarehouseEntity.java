package com.yylc.learnLSB.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class GoodsWarehouseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String goodsName;
    @Column
    private float price;
    @Column
    private float allNumber;
    @Column
    private float surplusNumber;
    @Column
    private Integer status;  // 0为下架，1正在销售
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public GoodsWarehouseEntity() {
    }

    public GoodsWarehouseEntity(Integer id, String goodsName, float price, float allNumber, float surplusNumber, Integer status, String createdTime, String changedTime) {
        this.id = id;
        this.goodsName = goodsName;
        this.price = price;
        this.allNumber = allNumber;
        this.surplusNumber = surplusNumber;
        this.status = status;
        this.createdTime = createdTime;
        this.changedTime = changedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAllNumber() {
        return allNumber;
    }

    public void setAllNumber(float allNumber) {
        this.allNumber = allNumber;
    }

    public float getSurplusNumber() {
        return surplusNumber;
    }

    public void setSurplusNumber(float surplusNumber) {
        this.surplusNumber = surplusNumber;
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