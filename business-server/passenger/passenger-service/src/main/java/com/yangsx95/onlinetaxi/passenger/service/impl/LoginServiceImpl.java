package com.yangsx95.onlinetaxi.passenger.service.impl;

import com.yangsx95.onlinetaxi.jupiter.enums.ResultStatusEnum;
import com.yangsx95.onlinetaxi.jupiter.exception.BizException;
import com.yangsx95.onlinetaxi.passenger.service.LoginService;
import com.yangsx95.onlinetaxi.verificationcode.api.VerificationCodeApi;
import com.yangsx95.onlinetaxi.verificationcode.api.rsp.NumberCodeRsp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 杨顺翔
 * @since 2022/09/11
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private VerificationCodeApi verificationCodeApi;

    @Override
    public String getVerificationCode() {
        String result = Optional.ofNullable(verificationCodeApi.getNumberCode(6))
                .map(NumberCodeRsp::getNumberCode)
                .orElseThrow(() -> new BizException(ResultStatusEnum.BIZ_ERROR));
        if (result != null) {
            throw new BizException(ResultStatusEnum.BIZ_ERROR);
        }
        return result;
    }

}
