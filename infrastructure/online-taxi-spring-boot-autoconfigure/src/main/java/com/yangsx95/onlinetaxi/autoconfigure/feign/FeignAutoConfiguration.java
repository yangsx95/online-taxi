package com.yangsx95.onlinetaxi.autoconfigure.feign;

import feign.Feign;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨顺翔
 * @since 2022/07/31
 */
@Configuration
@ConditionalOnClass(Feign.class)
public class FeignAutoConfiguration {

    @Bean
    public FeignRequestInterceptor feignRequestInterceptor() {
        return new FeignRequestInterceptor();
    }

}
