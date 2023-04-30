package com.nakanomay.springcloud.alibaba.dao;

import com.nakanomay.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author nakano_may丶
 * @create 2023/4/28
 * @Version 1.0
 * @description 订单接口
 */
@Mapper
public interface OrderDao
{
    /**
     * 1 新建订单
     * @param order
     */
    void create(Order order);

    /**
     * 2 修改订单状态，从零改为1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}