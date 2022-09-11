package com.yangsx95.onlinetaxi.jupiter.feign;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

import static com.yangsx95.onlinetaxi.jupiter.contstants.HttpHeader.SERVICE_TYPE;
import static com.yangsx95.onlinetaxi.jupiter.contstants.HttpHeader.SERVICE_TYPE_INNER_SERVICE;

/**
 * @author 杨顺翔
 * @since 2022/07/31
 */
@Configuration
@ConditionalOnClass(Feign.class)
public class FeignAutoConfiguration implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        // API 调用增加请求头
        template.header(SERVICE_TYPE, SERVICE_TYPE_INNER_SERVICE);
    }
}
