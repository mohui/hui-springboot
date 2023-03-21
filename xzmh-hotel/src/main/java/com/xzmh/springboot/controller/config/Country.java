package com.xzmh.springboot.controller.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties注解的prefix的值是配置文件的对象
 */
@Component// 将此类给spring容器管理
@ConfigurationProperties(prefix = "country")
public class Country {
    private String name;
    private String city;

    /**
     * Command + N -> 选 Getter and Setter
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
