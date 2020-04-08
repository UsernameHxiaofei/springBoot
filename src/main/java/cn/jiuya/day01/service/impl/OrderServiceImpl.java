package cn.jiuya.day01.service.impl;

import cn.jiuya.day01.Pojo.Order;
import cn.jiuya.day01.Pojo.OrderDTO;
import cn.jiuya.day01.Pojo.ResultInfo;
import cn.jiuya.day01.mapper.OrderMapper;
import cn.jiuya.day01.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderServiceImpl implements OrderService {

    Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

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


    @Transactional
    @Override
    public ResultInfo insertOrder(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order,orderDTO);
        orderDTO.setMoney(12);
        System.out.println("orderDTO = " + orderDTO);
        this.orderMapper.insertOrder(order);


        //【异常被被捕获不会影响这个事务
        try {
           int i =  1/0;
           return new ResultInfo(true,null,"");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("----------"+e.getMessage()+"------------");
            return new ResultInfo(true,null,e.getMessage()+"");
        }
        
    }
}
