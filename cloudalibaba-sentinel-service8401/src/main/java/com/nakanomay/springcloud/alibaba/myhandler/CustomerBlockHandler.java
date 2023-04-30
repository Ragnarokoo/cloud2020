package com.nakanomay.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.nakanomay.springcloud.entities.CommonResult;

/**
 * Created with IntelliJ IDEA.
 *
 * @author nakano_may丶
 * @date 2023/4/26
 * @Version 1.0
 * @description
 */
public class CustomerBlockHandler
{
    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444, "按客户自定义处理, global CustomerBlockHandler-------1");
    }

    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444, "按客户自定义处理, global CustomerBlockHandler--------2");
    }
}
