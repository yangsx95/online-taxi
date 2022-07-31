package com.yangsx95.onlinetaxi.autoconfigure.web;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import static org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type;

/**
 * web自动配置
 *
 * @author 杨顺翔
 * @since 2022/07/30
 */
@Configuration
@ConditionalOnWebApplication(type = Type.SERVLET)
public class WebAutoConfiguration implements WebMvcConfigurer {

}