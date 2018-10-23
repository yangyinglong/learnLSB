package com.yylc.learnLSB.controller;

import com.yylc.learnLSB.dao.entity.GoodsWarehouseEntity;
import com.yylc.learnLSB.dao.entity.UserEntity;
import com.yylc.learnLSB.dto.request.LoginRestDto;
import com.yylc.learnLSB.model.IShowService;
import com.yylc.learnLSB.util.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/user")
public class Controller {
    // model 层的接口
    @Autowired
    private IShowService show;

    @Path("/login")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> login(LoginRestDto loginRestDto) {

        Map<String, Object> resp = new HashMap<>();

        UserEntity userEntity = show.getUserEntityByPhone(loginRestDto.getPhone());
        if (!FormatUtil.isEmpty(userEntity)) {
            if (loginRestDto.getPassword().equals(userEntity.getPassword())) {
                resp.put("c", 200);
                System.out.println("userEntity ====>>> " + userEntity);
                resp.put("r", userEntity.getUserName());
            } else {
                resp.put("c", 401);
                resp.put("r", "密码错误");
            }

            return resp;
        }
        resp.put("c", 400);
        resp.put("r", "没有此用户");
        return resp;
    }

    @Path("showGoods")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> showGoods(String name) {

        Map<String, Object> resp = new HashMap<>();

        GoodsWarehouseEntity goodsEntity = show.getGoodsEntityByGoodsName(name);
        if (!FormatUtil.isEmpty(goodsEntity)) {
            resp.put("c", 200);
            resp.put("r", goodsEntity);
            return resp;
        }
        resp.put("c", 400);
        resp.put("r", "not this goods");
        return resp;
    }

}
