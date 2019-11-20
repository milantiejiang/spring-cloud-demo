package com.github.wxiaoqi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class AppEureka
{
    public static void main( String[] args ) {
        SpringApplication.run(AppEureka.class, args);
    }
}
