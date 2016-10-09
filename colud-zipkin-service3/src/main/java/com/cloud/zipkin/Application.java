package com.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * Created by liaokailin on 16/7/27.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Application {


    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }

}