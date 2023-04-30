package com.nakanomay.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/21
 * @Version 1.0
 * @description
 */
@EnableEurekaClient
@SpringBootApplication
public class GateWayMain9527
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayMain9527.class, args);
    }
}
