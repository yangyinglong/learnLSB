package com.yylc.learnLSB.dao.mapper;

import com.yylc.learnLSB.dao.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface IUserMapper {
    @Select("SELECT `id`, `userName`, `phone`, `password`, `status`, `createdTime`, `changedTime` FROM `user`")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "password", column = "password"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    List<UserEntity> queryAll();

    @Select("SELECT `id`, `userName`, `phone`, `password`, `status`, `createdTime`, `changedTime` FROM `user` WHERE `id` = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "password", column = "password"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    UserEntity queryByKey(@Param("id") String id);

    @Select("SELECT `id`, `userName`, `phone`, `password`, `status`, `createdTime`, `changedTime` FROM `user` WHERE `phone` = #{phone}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userName", column = "userName"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "password", column = "password"),
            @Result(property = "status", column = "status"),
            @Result(property = "createdTime", column = "createdTime"),
            @Result(property = "changedTime", column = "changedTime")
    })
    UserEntity queryByPhone(@Param("phone") String phone);

    @Insert("INSERT INTO `user`(`id`, `userName`, `phone`, `password`, `status`, `createdTime`) VALUES(#{id}, #{userName}, #{phone}, #{password}, #{status}, #{createdTime})")
    void insert(UserEntity userEntity);

    @Update("UPDATE `user` SET id=#{id}, userName=#{userName}, phone=#{phone}, password=#{password}, status=#{status}, createdTime=#{createdTime}, changedTime=#{changedTime} WHERE `id` = #{id}")
    void update(UserEntity userEntity);

    @Delete("DELETE FROM `user` WHERE `id` = #{id}")
    void delete(@Param("id") String id);

    @Update("UPDATE `user` SET status=0 WHERE `phone` = #{phone}")
    void deleteByPhone(@Param("phone") String phone);

}