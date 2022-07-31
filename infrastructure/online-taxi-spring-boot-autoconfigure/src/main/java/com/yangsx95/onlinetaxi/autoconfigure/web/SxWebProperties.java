package com.yangsx95.onlinetaxi.autoconfigure.web;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 杨顺翔
 * @since 2022/07/31
 */
@ConfigurationProperties("sx.web")
@Data
public class SxWebProperties {

    @Data
    public static class Result {

        private boolean enablePack = true;

        private Header[] noPackHeaders;
    }

    @Data
    public static class Header {

        private String key;

        private String[] values;
    }

}
