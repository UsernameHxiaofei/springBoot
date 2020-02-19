package cn.itcast.day01.mapper;

import cn.itcast.day01.Pojo.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

    /**
     * 根据订单号查询订单
     * @param orderNumber
     * @return
     */
    Order queryOrderByOrderNumber(@Param("orderNumber") String orderNumber);



    Order queryOrderAndUserAndOrderDetail(@Param("orderNumber")String orderNumber);

    Order queryOrderContextById(@Param("orderNumber")String orderNumber);
}
