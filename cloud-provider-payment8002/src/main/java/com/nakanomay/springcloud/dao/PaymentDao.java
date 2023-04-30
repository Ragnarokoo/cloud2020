package com.nakanomay.springcloud.dao;

import com.nakanomay.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/14
 * @Version 1.0
 * @description
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao
{
    /**
     * 新增接口
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
