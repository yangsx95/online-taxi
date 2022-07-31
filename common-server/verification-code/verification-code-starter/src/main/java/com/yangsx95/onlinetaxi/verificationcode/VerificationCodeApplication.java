package com.yangsx95.onlinetaxi.verificationcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@SpringBootApplication(scanBasePackages = "com.yangsx95")
@RefreshScope
@EnableDiscoveryClient
public class VerificationCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerificationCodeApplication.class, args);
    }
    
}
