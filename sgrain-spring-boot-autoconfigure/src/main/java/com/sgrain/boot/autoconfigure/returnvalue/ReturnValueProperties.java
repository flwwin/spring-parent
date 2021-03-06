package com.sgrain.boot.autoconfigure.returnvalue;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: spring-parent
 * @description: 返回值配置文件类
 * @create: 2020/03/25
 */
@ConfigurationProperties(prefix = "spring.sgrain.return-value")
public class ReturnValueProperties {
    /**
     * 组件开关
     */
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
