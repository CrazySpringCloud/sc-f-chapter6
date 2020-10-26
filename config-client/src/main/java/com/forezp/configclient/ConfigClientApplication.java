package com.forezp.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigClientApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args) {
        logger.info("Spring Cloud 配置客户端 config-client begin to start.....");
        SpringApplication.run(ConfigClientApplication.class, args);
        logger.info("Spring Cloud 配置客户端 config-client started.....");
    }

}
