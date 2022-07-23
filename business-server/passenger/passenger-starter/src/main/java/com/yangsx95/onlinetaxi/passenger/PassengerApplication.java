package com.yangsx95.onlinetaxi.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
public class PassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassengerApplication.class, args);
    }
    
}
