package com.github.wxiaoqi.security.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {
    @KafkaListener(topics = {"test"})
    public void consumer(String message){
        log.info("test topic message : {}", message);
    }
}
