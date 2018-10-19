package com.yylc.learnLSB.model;

import com.yylc.learnLSB.dao.entity.GoodsWarehouseEntity;
import com.yylc.learnLSB.dao.entity.UserEntity;
import com.yylc.learnLSB.dao.mapper.IGoodsWarehouseMapper;
import com.yylc.learnLSB.dao.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service 的作用是：
 * 1、声明ShowModelImp.java是一个bean，这点很重要，因为ShowModelImp.java是一个bean，
 *    其他的类才可以使用@Autowired将ShowModelImp作为一个成员变量自动注入
 * 2、ShowModelImp.java在bean中的id是"showModelImp"，即类名且首字母小写
 */
@Service
public class ShowModelImp implements IShowService{

    @Autowired
    IUserMapper userMapper;
    @Autowired
    IGoodsWarehouseMapper goodsMapper;

    @Override
    public UserEntity getUserEntityByPhone(String phone) {
        return userMapper.queryByPhone(phone);
    }

    @Override
    public GoodsWarehouseEntity getGoodsEntityByGoodsName(String name) {
        return goodsMapper.queryByGoodsName(name);
    }
}
