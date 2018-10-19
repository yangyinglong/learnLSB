package com.yylc.learnLSB.controller;

import com.yylc.learnLSB.dao.entity.GoodsWarehouseEntity;
import com.yylc.learnLSB.dao.entity.UserEntity;
import com.yylc.learnLSB.model.IShowService;
import com.yylc.learnLSB.util.FormatUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class Controller {
    // model 层的接口
    @Autowired
    private IShowService show;

    @Path("/showUser")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, Object> showUser(String phone) {

        Map<String, Object> resp = new HashMap<>();

        UserEntity userEntity = show.getUserEntityByPhone(phone);
        if (!FormatUtil.isEmpty(userEntity)) {
            resp.put("c", 200);
            resp.put("r", userEntity);
            return resp;
        }
        resp.put("c", 400);
        resp.put("r", "not this user");
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
