package com.tulingxueyuan.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/12 23:12
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @RequestMapping("")
    public String index(){
        return "这是网关服务，本身不提供任何接口，请调用正确的服务路径地址！！！！";
    }
}
