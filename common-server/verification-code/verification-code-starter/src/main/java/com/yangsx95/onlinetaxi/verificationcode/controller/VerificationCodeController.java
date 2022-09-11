package com.yangsx95.onlinetaxi.verificationcode.controller;

import com.yangsx95.onlinetaxi.jupiter.annotation.PathRestController;
import com.yangsx95.onlinetaxi.verificationcode.api.VerificationCodeApi;
import com.yangsx95.onlinetaxi.verificationcode.api.rsp.NumberCodeRsp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 验证码
 *
 * @author 杨顺翔
 * @since 2022/09/11
 */
@PathRestController
public class VerificationCodeController implements VerificationCodeApi {

    @GetMapping("/numberCode/{size}")
    @Override
    public NumberCodeRsp getNumberCode(@PathVariable Integer size) {
        var code = (long) (Math.random() * Math.pow(10, size));
        return new NumberCodeRsp(Long.valueOf(code).toString());
    }
}
