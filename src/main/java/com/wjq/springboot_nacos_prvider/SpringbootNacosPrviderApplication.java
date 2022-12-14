package com.wjq.springboot_nacos_prvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;


@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootNacosPrviderApplication {



        public static void main(String[] args) {
        SpringApplication.run(SpringbootNacosPrviderApplication.class, args);


    }

}
