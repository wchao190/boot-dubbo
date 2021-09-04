package com.atguigu.gmall;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * 订单接口
 */
public interface OrderService {

    // 订单初始化
    public abstract List<UserAddress> initOrder(String userId);
}
