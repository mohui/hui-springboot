package com.xzmh.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SchoolController {

    @PostMapping(value = "/school/list/{age}")
    public Object list(@PathVariable("age") Integer age) {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id", "123");
        retMap.put("name", "张三");
        retMap.put("age", age);
        return retMap;
    }
}
