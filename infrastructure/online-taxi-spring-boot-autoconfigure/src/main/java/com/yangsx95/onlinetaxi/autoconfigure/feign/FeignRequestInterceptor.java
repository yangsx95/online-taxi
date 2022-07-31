package com.yangsx95.onlinetaxi.autoconfigure.feign;

import com.yangsx95.onlinetaxi.autoconfigure.contstants.HttpHeader;
import feign.RequestInterceptor;
import feign.RequestTemplate;

import static com.yangsx95.onlinetaxi.autoconfigure.contstants.HttpHeader.SERVICE_TYPE;
import static com.yangsx95.onlinetaxi.autoconfigure.contstants.HttpHeader.SERVICE_TYPE_INNER_SERVICE;

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
        requestTemplate.header(SERVICE_TYPE, SERVICE_TYPE_INNER_SERVICE);
    }
}
