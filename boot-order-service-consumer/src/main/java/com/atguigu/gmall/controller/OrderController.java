package com.atguigu.gmall.controller;

import com.atguigu.gmall.OrderService;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid")String userId){
        return orderService.initOrder(userId);
    }
}
