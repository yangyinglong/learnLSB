package com.yylc.learnLSB.model.logicalModel;

import com.yylc.learnLSB.dao.entity.UserEntity;
import com.yylc.learnLSB.dao.mapper.IUserMapper;
import com.yylc.learnLSB.dto.request.SendEmailRestDto;
import com.yylc.learnLSB.util.FormatUtil;
import com.yylc.learnLSB.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Properties;

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

    @Override
    public UserEntity getUserEntityByPhone(String phone) {
        UserEntity userEntity;
        try {
            userEntity = userMapper.queryByPhone(phone);
            if (FormatUtil.isEmpty(userEntity)) {
                userEntity = userMapper.queryByName(phone);
            }
        } catch (Exception e) {
            return null;
        }
        return userEntity;
    }

    @Override
    public Boolean sendEmail(SendEmailRestDto sendEmailRestDto) {
       

        return false;

    }

}
