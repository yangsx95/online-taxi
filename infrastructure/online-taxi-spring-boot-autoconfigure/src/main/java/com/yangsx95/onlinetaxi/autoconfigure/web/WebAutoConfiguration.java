package com.yangsx95.onlinetaxi.autoconfigure.web;

import com.yangsx95.onlinetaxi.autoconfigure.web.result.ResultPackageHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type;

/**
 * web自动配置
 *
 * @author 杨顺翔
 * @since 2022/07/30
 */
@Configuration
@ConditionalOnWebApplication(type = Type.SERVLET)
public class WebAutoConfiguration {

    /**
     * controller返回值自动包装Result配置处理器
     *
     * @return ResponseBodyAdvice
     */
    @Bean
    public ResultPackageHandler resultPackageHandler() {
        return new ResultPackageHandler();
    }

}