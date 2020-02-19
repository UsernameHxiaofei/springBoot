package cn.itcast.day01.service;

import cn.itcast.day01.Pojo.Order;
import cn.itcast.day01.Pojo.ResultInfo;

public interface OrderService {
    Order queryOrderByOrderNumber(String orderNumber);

    ResultInfo queryOrderAndUserAndOrderDetail(String orderNumber);

    ResultInfo queryOrderContextById(String orderNumber);
}
