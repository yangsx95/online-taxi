package com.yangsx95.onlinetaxi.passenger.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@RestController
public class TestController {

    @Value("${useCache}")
    private boolean useCache;
    
    @GetMapping("/test")
    public void test() {
        System.out.println(useCache);
    }
    
}
