package com.yangsx95.onlinetaxi.verificationcode.api;

import com.yangsx95.onlinetaxi.common.result.Result;
import com.yangsx95.onlinetaxi.verificationcode.api.rsp.NumberCodeRsp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 验证码获取API
 *
 * @author 杨顺翔
 * @since 2022/07/23
 */
@FeignClient("verification-code")
public interface VerificationCodeApi {

    /**
     * 获取指定长度的数字验证码
     *
     * @param size 长度，最大长度为9位
     * @return 数字验证码
     */
    @GetMapping(path = "/numberCode/{size}")
    Result<NumberCodeRsp> getNumberCode(@PathVariable Integer size);

}
