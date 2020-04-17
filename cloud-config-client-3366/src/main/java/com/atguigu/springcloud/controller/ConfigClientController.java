package com.atguigu.springcloud.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author wsk
 * @date 2020/3/16 22:35
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${jdbc.username}")
    private String username;
    @Value(("${jdbc.password}"))
    private String psd;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return "username: "+username+"\t\n\n configInfo: "+psd;
    }
}