package com.yangsx95.onlinetaxi.passenger.controller;

import com.yangsx95.onlinetaxi.jupiter.annotation.PathRestController;
import com.yangsx95.onlinetaxi.passenger.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author 杨顺翔
 * @since 2022/09/11
 */
@PathRestController("/login")
public class LoginController {

    @Resource
    private LoginService loginService;

    /**
     * 获取登录验证码
     *
     * @return 验证码
     */
    @GetMapping("/verificationCode")
    public String getLoginVerificationCode() {
        return loginService.getVerificationCode();
    }

}
