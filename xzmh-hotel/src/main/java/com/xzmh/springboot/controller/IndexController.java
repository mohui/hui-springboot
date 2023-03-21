package com.xzmh.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @Value("${hotel.name}")
    private String hotelName;

    @Value("${hotel.title}")
    private String hotelTitle;
    /**
     * Application启动, localhost:8080/say 访问
     *
     * @return ""
     */
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        String test = "到Application启动, postman访问, localhost:8080/say";
        return hotelName + hotelTitle + test;
    }

    /**
     * 第二个接口测试
     */
    @RequestMapping(value = "/mapValue")
    public @ResponseBody Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("message", "设置上下文根: server.servlet.context-path=/whh");
        retMap.put("test", "设置上下文根: server.servlet.context-path=/whh");
        return retMap;
    }
}
