package com.xzmh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    /**
     * Application启动, localhost:8080/say 访问
     *
     * @return ""
     */
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "hello, 西张明的朋友们";
    }
}
