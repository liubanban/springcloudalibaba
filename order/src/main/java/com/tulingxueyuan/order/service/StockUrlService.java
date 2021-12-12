package com.tulingxueyuan.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/12 21:01
 */
@FeignClient(name = "stock1" ,url = "http://localhost:8080")
public interface StockUrlService {
    @RequestMapping("/stock/reduct")
    String reduct();
}
