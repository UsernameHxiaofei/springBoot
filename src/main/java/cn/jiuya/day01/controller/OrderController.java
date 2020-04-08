package cn.jiuya.day01.controller;

import cn.jiuya.day01.Pojo.Order;
import cn.jiuya.day01.Pojo.ResultInfo;
import cn.jiuya.day01.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("Order")
@Api("订单服务接口")
public class OrderController {

    @Autowired
    private OrderService orderServiceImpl;


    /**
     * 根据订单号查询订单，并且带出下单人的信息
     */
    @ApiOperation(value = "根据订单编号查询订单", notes = "查询订单")
    @GetMapping(value = "queryOrderByOrderNumber")
    @ApiImplicitParam(name = "orderNumber", required = true, value = "订单号码")
    public ResultInfo queryOrderByOrderNumber (@RequestParam("orderNumber") String orderNumber) {
        Order order =  orderServiceImpl.queryOrderByOrderNumber(orderNumber);
        return new ResultInfo(true, order, null);

    }

    @ApiOperation(value = "查询订单的详情", notes = "查询订单")
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


    @PostMapping("insertOrder")
    public ResultInfo insertOrder  (@RequestBody Order order) {
        System.out.println("order = " + order);
        ResultInfo resultInfo = this.orderServiceImpl.insertOrder(order);
        return  resultInfo;
    }





}
