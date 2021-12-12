package com.tulingxueyuan.order.service;

import com.tulingxueyuan.order.service.fallback.StockFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/12 20:42
 */
@FeignClient(name = "stock" ,fallback = StockFallBack.class)
public interface StockService {

    @RequestMapping("/stock/reduct")
    String reduct();

}
