package com.yangsx95.onlinetaxi.jupiter.feign;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨顺翔
 * @since 2022/07/31
 */
@Configuration
@ConditionalOnBean(EnableFeignClients.class)
public class FeignAutoConfiguration {

    @Bean
    public FeignRequestInterceptor feignRequestInterceptor() {
        return new FeignRequestInterceptor();
    }

}
