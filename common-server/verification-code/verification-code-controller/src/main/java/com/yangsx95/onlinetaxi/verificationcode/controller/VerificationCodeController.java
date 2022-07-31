package com.yangsx95.onlinetaxi.verificationcode.controller;

import com.yangsx95.onlinetaxi.autoconfigure.annotation.PathRestController;
import com.yangsx95.onlinetaxi.verificationcode.api.VerificationCodeApi;
import com.yangsx95.onlinetaxi.verificationcode.api.rsp.NumberCodeRsp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@PathRestController
@Validated
public class VerificationCodeController implements VerificationCodeApi {

    @GetMapping(path = "/numberCode/{size}")
    @Override
    public NumberCodeRsp getNumberCode(@PathVariable Integer size) {
        NumberCodeRsp rsp = new NumberCodeRsp();
        double randomDouble = new Random().nextDouble();
        int numberCode = (int) (randomDouble * Math.pow(10, size));
        rsp.setNumberCode(numberCode);
        return rsp;
    }
}
