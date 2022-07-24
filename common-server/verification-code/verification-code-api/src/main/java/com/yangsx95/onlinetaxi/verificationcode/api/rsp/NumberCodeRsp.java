package com.yangsx95.onlinetaxi.verificationcode.api.rsp;

import lombok.Data;

/**
 * @author 杨顺翔
 * @since 2022/07/23
 */
@Data
public class NumberCodeRsp {

    /**
     * 数字验证码
     */
    private Integer numberCode;

}
