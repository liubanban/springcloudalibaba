package com.tulingxueyuan.order.controller;

import com.tulingxueyuan.order.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/11 22:58
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/add")
    public String add() {
        String msg1 = stockService.reduct();
        HashMap map = new HashMap();
        map.put("msg1",msg1);

        return "hello word" + map.toString();
    }
}
