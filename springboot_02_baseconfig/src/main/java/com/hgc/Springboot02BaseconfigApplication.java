package com.hgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置文件加载顺序 properties -> yml - > yaml
 */
@SpringBootApplication
public class Springboot02BaseconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02BaseconfigApplication.class, args);
    }

}
