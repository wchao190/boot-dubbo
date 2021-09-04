package com.atguigu.gmall.service.impl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.OrderService;
import com.atguigu.gmall.UserService;
import com.atguigu.gmall.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference(version = "1.0.0")
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {

        return userService.getUserAddress(userId);
    }
}
