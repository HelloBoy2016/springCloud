package com.example.demo;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xubiao on 2017/5/15-18:33.
 * Description :
 */
@RestController
public class HelloContrller {

    @RequestMapping("/hello")
    public String hello(){
        return  "hello";
    }
}
