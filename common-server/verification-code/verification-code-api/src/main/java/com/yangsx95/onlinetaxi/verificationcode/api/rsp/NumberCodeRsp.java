package com.yangsx95.onlinetaxi.verificationcode.api.rsp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NumberCodeRsp {

    /**
     * 数字验证码
     */
    private String numberCode;

}
