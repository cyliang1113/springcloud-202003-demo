package com.leolab.springcloud202003demo.ordercenter.controller;

import com.leolab.springcloud202003demo.usercenter.api.UserCenterFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@Slf4j
@RestController
public class OrderController {

    @Resource
    public UserCenterFacade userCenterFacade;

    @PostMapping("orderList")
    public Object orderList() {
        log.info("orderList()");
        String address = userCenterFacade.getAddress("Jack");

        HashMap<Object, Object> map = new HashMap<>();
        map.put("order", "list");
        map.put("add", address);
        return map;
    }
}
