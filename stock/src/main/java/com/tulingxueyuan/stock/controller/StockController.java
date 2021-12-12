package com.tulingxueyuan.stock.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/11 23:05
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/reduct")
    public String reduct() throws Exception {

        System.out.println("扣减库存");

//        return "扣减库存";
        throw  new Exception("error");
    }


    @RequestMapping("/pList")
    public List<String> pList(List<String> list){

        list.parallelStream().forEach(e->{
            System.out.println("e="+e);
            e = e+"1";
        });
        return list;
    }
}
