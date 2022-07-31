package com.yangsx95.onlinetaxi.verificationcode.controller;

import com.yangsx95.onlinetaxi.autoconfigure.annotation.PathRestController;
import com.yangsx95.onlinetaxi.verificationcode.api.VerificationCodeApi;
import com.yangsx95.onlinetaxi.verificationcode.api.rsp.NumberCodeRsp;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
    public NumberCodeRsp getNumberCode(@PathVariable
                                       @Min(value = 3, message = "验证码长度最大只能为9位, 最小为3位")
                                       @Max(value = 9, message = "验证码长度最大只能为9位, 最小为3位")
                                       Integer size) {
        NumberCodeRsp rsp = new NumberCodeRsp();
        double randomDouble = new Random().nextDouble();
        int numberCode = (int) (randomDouble * Math.pow(10, size));
        rsp.setNumberCode(numberCode);
        return rsp;
    }
}
