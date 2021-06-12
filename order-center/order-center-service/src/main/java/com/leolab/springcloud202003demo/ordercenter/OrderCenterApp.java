package com.leolab.springcloud202003demo.ordercenter;

import com.leolab.springcloud202003demo.usercenter.api.UserCenterFacade;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableFeignClients(basePackageClasses = {
        UserCenterFacade.class
})
@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class OrderCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderCenterApp.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return String.format("Hello Order Center!");
    }
}
