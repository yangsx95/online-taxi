package com.yangsx95.onlinetaxi.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 响应结果包装
 *
 * @author 杨顺翔
 * @since 2022/07/23
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
    FAIL(-1, "请求失败"),

    ;

    private final int code;

    private final String message;
}
