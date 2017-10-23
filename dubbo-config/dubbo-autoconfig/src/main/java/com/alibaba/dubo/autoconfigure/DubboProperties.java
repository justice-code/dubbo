package com.alibaba.dubo.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = DubboProperties.DUBBO_PREFIX)
public class DubboProperties {

    public static final String DUBBO_PREFIX = "dubbo";
}
