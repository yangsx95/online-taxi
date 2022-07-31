package com.yangsx95.onlinetaxi.autoconfigure.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * feign的请求拦截器拦截器
 *
 * @author 杨顺翔
 * @since 2022/07/31
 */
public class FeignRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        // 服务类型为内部服务
        requestTemplate.header("S-X-Service-Type", "service");
    }
}
