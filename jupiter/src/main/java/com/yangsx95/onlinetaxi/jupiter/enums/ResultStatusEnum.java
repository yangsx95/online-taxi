package com.yangsx95.onlinetaxi.jupiter.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用响应枚举
 *
 * @author 杨顺翔
 * @since 2022/07/31
 */
@AllArgsConstructor
@Getter
public enum ResultStatusEnum implements ResultStatus {

    /**
     * 通用成功响应
     */
    SUCCESS(1, "请求成功"),

    /**
     * 通用失败响应
     */
    INNER_ERROR(-1, "服务器内部异常，请联系管理员"),

    ;

    private final Integer code;

    private final String message;
}