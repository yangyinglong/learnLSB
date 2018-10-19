package com.yylc.learnLSB.dao.mapper;

import com.yylc.learnLSB.dao.entity.GoodsWarehouseEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IGoodsWarehouseMapper {
    @Select("SELECT `id`, `goodsName`, `price`, `allNumber`, `surplusNumber`, `status`, `createdTime`, `changedTime` FROM `goodsWarehouse`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "goodsName", column = "goodsName"),
            @Result(property = "price", column = "price"),
            @Result(property = "allNumber", column = "allNumber"),
            @Result(property = "surplusNumber", column = "surplusNumber"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    List<GoodsWarehouseEntity> queryAll();

    @Select("SELECT `id`, `goodsName`, `price`, `allNumber`, `surplusNumber`, `status`, `createdTime`, `changedTime` FROM `goodsWarehouse` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "goodsName", column = "goodsName"),
            @Result(property = "price", column = "price"),
            @Result(property = "allNumber", column = "allNumber"),
            @Result(property = "surplusNumber", column = "surplusNumber"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    GoodsWarehouseEntity queryByKey(@Param("id") Integer id);

    @Select("SELECT `id`, `goodsName`, `price`, `allNumber`, `surplusNumber`, `status`, `createdTime`, `changedTime` FROM `goodsWarehouse` WHERE `goodsName` = #{goodsName}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "goodsName", column = "goodsName"),
            @Result(property = "price", column = "price"),
            @Result(property = "allNumber", column = "allNumber"),
            @Result(property = "surplusNumber", column = "surplusNumber"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    GoodsWarehouseEntity queryByGoodsName(@Param("goodsName") String goodsName);

    @Insert("INSERT INTO `goodsWarehouse`(`id`, `goodsName`, `price`, `allNumber`, `surplusNumber`, `status`, `createdTime`) VALUES(#{id}, #{goodsName}, #{price}, #{allNumber}, #{surplusNumber}, #{status}, #{createdTime})")
    void insert(GoodsWarehouseEntity goodsWarehouseEntity);

    @Update("UPDATE `goodsWarehouse` SET id=#{id}, goodsName=#{goodsName}, price=#{price}, allNumber=#{allNumber}, surplusNumber=#{surplusNumber}, status=#{status}, createdTime=#{createdTime} WHERE `id` = #{id}")
    void update(GoodsWarehouseEntity goodsWarehouseEntity);

    @Delete("DELETE FROM `goodsWarehouse` WHERE `id` = #{id}")
    void delete(@Param("id") Integer id);

}