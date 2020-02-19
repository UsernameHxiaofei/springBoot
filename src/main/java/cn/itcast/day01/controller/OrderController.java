package cn.itcast.day01.controller;

import cn.itcast.day01.Pojo.Order;
import cn.itcast.day01.Pojo.ResultInfo;
import cn.itcast.day01.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Order")
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;


    /**
     * 根据订单号查询订单，并且带出下单人的信息
     */

    @RequestMapping(value = "queryOrderByOrderNumber", method = RequestMethod.GET)
    public ResultInfo queryOrderByOrderNumber (@RequestParam("orderNumber") String orderNumber) {
        Order order =  orderServiceImpl.queryOrderByOrderNumber(orderNumber);
        return new ResultInfo(true, order, null);

    }


    @RequestMapping(value = "queryOrderAndUserAndOrderDetail", method = RequestMethod.GET)
    public ResultInfo queryOrderAndUserAndOrderDetail (@RequestParam("orderNumber") String orderNumber) {
        ResultInfo resultInfo = orderServiceImpl.queryOrderAndUserAndOrderDetail(orderNumber);
        return resultInfo;
    }


    @RequestMapping(value = "queryOrderContextById", method = RequestMethod.GET)
    public ResultInfo queryOrderContextById (@RequestParam("orderNumber") String orderNumber) {
        System.out.println("orderNumber = " + orderNumber);
       return orderServiceImpl.queryOrderContextById(orderNumber);
    }


}
