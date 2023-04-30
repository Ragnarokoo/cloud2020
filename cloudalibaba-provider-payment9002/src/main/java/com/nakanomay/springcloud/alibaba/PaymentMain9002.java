package com.nakanomay.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/24
 * @Version 1.0
 * @description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
