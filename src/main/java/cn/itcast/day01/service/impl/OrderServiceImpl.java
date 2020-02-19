package cn.itcast.day01.service.impl;

import cn.itcast.day01.Pojo.Order;
import cn.itcast.day01.Pojo.ResultInfo;
import cn.itcast.day01.mapper.OrderMapper;
import cn.itcast.day01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order queryOrderByOrderNumber(String orderNumber) {
        try {
            if (orderNumber == null) {
                throw new Exception("订单好不存在");
            }
            Order order =  orderMapper.queryOrderByOrderNumber(orderNumber);
            return order;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public ResultInfo queryOrderAndUserAndOrderDetail(String orderNumber) {
        if (orderNumber == null) {
            return new ResultInfo(false, null, "订单号必填");
        } else {
            Order order = orderMapper.queryOrderAndUserAndOrderDetail(orderNumber);
            return new ResultInfo(true, order, null);
        }

    }

    @Override
    public ResultInfo queryOrderContextById(String orderNumber) {
        if (orderNumber == null && orderNumber =="") {
            return  new ResultInfo(false, null, "订单号必填");
        } else {
          Order order =  orderMapper.queryOrderContextById(orderNumber);
          return  new ResultInfo(true, order,"");
        }
    }
}
