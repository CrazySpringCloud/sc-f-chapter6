package com.forezp.configclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

    private static final Logger logger = LoggerFactory.getLogger(ConfigClientApplication.class);

    public static void main(String[] args) {
        logger.info("Spring Cloud 配置中心服务 config-server begin to start.....");
        SpringApplication.run(ConfigClientApplication.class, args);
        logger.info("Spring Cloud 配置中心服务 config-server started.....");
    }

}
