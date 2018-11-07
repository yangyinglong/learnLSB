package com.yylc.learnLSB.dao.mapper;

import com.yylc.learnLSB.dao.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import java.util.List;


@Mapper
public interface IUserMapper {
@Select("SELECT `id`, `name`, `phone`, `password`, `email`, `statue`, `created_time`, `changed_time` FROM `user`")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "name", column = "name"), 
@Result(property = "phone", column = "phone"), 
@Result(property = "password", column = "password"), 
@Result(property = "email", column = "email"), 
@Result(property = "statue", column = "statue"), 
@Result(property = "createdTime", column = "created_time"), 
@Result(property = "changedTime", column = "changed_time")
})
List<UserEntity> queryAll();
@Select("SELECT `id`, `name`, `phone`, `password`, `email`, `statue`, `created_time`, `changed_time` FROM `user` WHERE `id` = #{id}")
@Results({
@Result(property = "id", column = "id"), 
@Result(property = "name", column = "name"), 
@Result(property = "phone", column = "phone"), 
@Result(property = "password", column = "password"), 
@Result(property = "email", column = "email"), 
@Result(property = "statue", column = "statue"), 
@Result(property = "createdTime", column = "created_time"), 
@Result(property = "changedTime", column = "changed_time")
})
UserEntity queryByKey(@Param("id") Integer id);

@Insert("INSERT INTO `user`(`id`, `name`, `phone`, `password`, `email`, `statue`, `created_time`, `changed_time`) VALUES(#{id}, #{name}, #{phone}, #{password}, #{email}, #{statue}, #{createdTime}, #{changedTime})")
void insert(UserEntity userEntity);

@Update("UPDATE `user` SET id=#{id}, name=#{name}, phone=#{phone}, password=#{password}, email=#{email}, statue=#{statue}, created_time=#{createdTime}, changed_time=#{changedTime} WHERE `id` = #{id}")
void update(UserEntity userEntity);

@Delete("DELETE FROM `user` WHERE `id` = #{id}")
void delete(@Param("id") Integer id);

}