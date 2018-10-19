package com.yylc.learnLSB.model;


import com.yylc.learnLSB.dao.entity.*;

public interface IShowService {
    UserEntity getUserEntityByPhone(String phone);
    GoodsWarehouseEntity getGoodsEntityByGoodsName(String name);
}
