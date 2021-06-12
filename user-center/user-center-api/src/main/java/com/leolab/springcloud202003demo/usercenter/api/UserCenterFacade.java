package com.leolab.springcloud202003demo.usercenter.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("user-center")
public interface UserCenterFacade {

    @PostMapping("getUserAddress")
    String getAddress(@RequestParam(name = "username") String username);
}
