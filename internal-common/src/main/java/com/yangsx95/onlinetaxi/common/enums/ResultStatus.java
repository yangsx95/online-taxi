package com.yangsx95.onlinetaxi.common.enums;

/**
 * 响应状态枚举抽象
 * 
 * @author 杨顺翔
 * @since 2022/07/23
 */
public interface ResultStatus {

    int getCode();

    String getMessage();
}
