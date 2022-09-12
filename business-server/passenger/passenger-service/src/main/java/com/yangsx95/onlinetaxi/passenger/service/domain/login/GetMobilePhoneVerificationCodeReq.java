package com.yangsx95.onlinetaxi.passenger.service.domain.login;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author 杨顺翔
 * @since 2022/09/12
 */
@Data
public class GetMobilePhoneVerificationCodeReq implements Serializable {

    @Serial
    private static final long serialVersionUID = 5059414790356430520L;

    private String mobilePhone;
}
