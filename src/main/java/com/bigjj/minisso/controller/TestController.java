package com.bigjj.minisso.controller;

import com.bigjj.minisso.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mr-liu
 * @date 2018/9/4
 * @desc
 */
@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;


    @RequestMapping("test_config")
    public String testConfig() {
        return weChatConfig.getAppId();
    }

}
