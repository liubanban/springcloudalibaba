package com.tulingxueyuan.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/11 23:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class,args);
    }
}
