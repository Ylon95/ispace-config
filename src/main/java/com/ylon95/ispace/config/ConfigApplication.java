/*
 * Copyright © 2020 ~ now Ylon95 All rights reserved. http://www.ylon95.club
 */
package com.ylon95.ispace.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * iSpace 分布式云配置服务启动类
 *
 * @author Ylon95
 * @version V 1.0.0
 * @date 2020/4/28 22:41
 * @since JDK 1.8
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
