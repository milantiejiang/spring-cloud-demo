package com.github.wxiaoqi.security.auth.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;

@Configuration
public class RabbitConfig {
    /**
     * 定义队列名
     */
    private final static String STRING = "string";

    /**
     * 定义string队列
     *
     * @return
     */
    @Bean
    public Queue string() {
        return new Queue(STRING);
    }
}
