package cn.jiuya.day01.service;

import cn.jiuya.day01.Pojo.Order;
import cn.jiuya.day01.Pojo.ResultInfo;

public interface OrderService {
    Order queryOrderByOrderNumber(String orderNumber);

    ResultInfo queryOrderAndUserAndOrderDetail(String orderNumber);

    ResultInfo queryOrderContextById(String orderNumber);

    ResultInfo insertOrder(Order order);
}
