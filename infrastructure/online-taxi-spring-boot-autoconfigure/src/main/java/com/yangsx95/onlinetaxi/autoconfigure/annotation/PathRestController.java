package com.yangsx95.onlinetaxi.autoconfigure.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * 拥有路径的RestController控制器标记。是 {@link org.springframework.web.bind.annotation.RestController} 以及
 * {@link org.springframework.web.bind.annotation.RequestMapping} 的组合
 *
 * @author 杨顺翔
 * @since 2022/07/31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@RequestMapping
public @interface PathRestController {

    @AliasFor("path")
    String[] value() default {};

    @AliasFor("value")
    String[] path() default {};
}
