package com.nakanomay.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/19
 * @Version 1.0
 * @description 手写负载均衡算法接口
 */
public interface LoadBalancer
{
    ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
