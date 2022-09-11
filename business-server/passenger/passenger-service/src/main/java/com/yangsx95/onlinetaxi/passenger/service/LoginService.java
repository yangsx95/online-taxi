package com.yangsx95.onlinetaxi.passenger.service;

/**
 * 登录
 *
 * @author 杨顺翔
 * @since 2022/09/11
 */
public interface LoginService {

    /**
     * 获取登录验证码
     *
     * @return 登录验证码
     */
    String getVerificationCode();

}
