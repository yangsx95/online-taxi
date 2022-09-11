package com.yangsx95.onlinetaxi.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@SpringBootApplication
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yangsx95.onlinetaxi.verificationcode.api")
public class PassengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassengerApplication.class, args);
    }

}
