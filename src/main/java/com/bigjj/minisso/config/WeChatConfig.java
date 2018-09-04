package com.bigjj.minisso.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author mr-liu
 * @date 2018/9/4
 * @desc 微信配置类
 */
@Configuration
@PropertySource(value = "classpath:application.properties")
@Setter
@Getter
public class WeChatConfig {
    /**
     * 公众号 appId
     */
    @Value("${wxpay.appid}")
    private String appId;
    /**
     * 公众号秘钥
     */
    @Value("${wxpay.appsecret}")
    private String appsecret;
}
