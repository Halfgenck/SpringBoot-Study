package com.hgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 多环境配置文件
 *
 * 文件拆分  -dev -devMVC -devDB....
 * spring:
 *   profiles:
 *     active: dev
 *     include: devDB, devMVC
 *
 * spring:
 *   profiles:
 *     active: @profile.active@
 *     group:
 *       "dev": devDB, devMVC
 *       "pro": proDB, proMVC
 *       "test": testDB, TestMVC
 * 坐标
 *
 * <profiles>
 * 		<profile>
 * 			<id>env_dev</id>
 * 			<properties>
 * 				<profile.active>dev</profile.active>
 * 			</properties>
 * 			<activation>
 * 				<activeByDefault>true</activeByDefault>
 * 			</activation>
 * 		</profile>
 * 	</profiles>
 */
@SpringBootApplication
public class Springboot08PropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08PropertiesApplication.class, args);
    }

}
