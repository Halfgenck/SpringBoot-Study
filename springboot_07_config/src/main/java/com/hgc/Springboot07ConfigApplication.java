package com.hgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 四级配置文件
 * file : config/application.properties
 * file : application.yml
 * classpath : config/application.properties
 * classpath : application.yml
 * 优先级 : file > classpath and properties > yml
 * 自定义配置文件
 * Edit Configurations -> Program argument -> --spring.config=配置文件名
 * 多环境配置文件
 *      不同环境配置放在同一文件
 *      拆分不同环境配置文件
 */
@SpringBootApplication
public class Springboot07ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot07ConfigApplication.class, args);
    }

}
