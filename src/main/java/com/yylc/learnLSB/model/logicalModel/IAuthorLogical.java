package com.yylc.learnLSB.model.logicalModel;


import com.yylc.learnLSB.dao.entity.*;
import com.yylc.learnLSB.dto.request.RegisterRestDto;
import com.yylc.learnLSB.dto.request.SendEmailRestDto;

public interface IShowService {
    UserEntity getUserEntityByPhone(String phone);

    Boolean sendEmail(SendEmailRestDto sendEmailRestDto);


//    void insert(RegisterRestDto registerRestDto);
}
