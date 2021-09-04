package com.atguigu.gmall;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddress(String userId);
}
