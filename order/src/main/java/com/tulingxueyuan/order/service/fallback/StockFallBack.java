package com.tulingxueyuan.order.service.fallback;

import com.tulingxueyuan.order.service.StockService;
import org.springframework.stereotype.Component;

/**
 * @author liubb31
 * @version 1.0
 * @description: TODO
 * @date 2021/12/12 21:18
 */
@Component()
public class StockFallBack implements StockService {

    @Override
    public String reduct() {
        return "服务端失败了，这个是默认显示内容";
    }
}
