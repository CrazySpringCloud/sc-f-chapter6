package com.forezp.configserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
@EnableDiscoveryClient
public class ConfigServerApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);

    public static void main(String[] args) {
        logger.info("Spring Cloud 配置中心服务 config-server begin to start.....");
        SpringApplication.run(ConfigServerApplication.class, args);
        logger.info("Spring Cloud 配置中心服务 config-server started.....");
    }

}
