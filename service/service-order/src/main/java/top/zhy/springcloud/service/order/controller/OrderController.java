package top.zhy.springcloud.service.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhy.springcloud.api.stock.feign.StockFeignCilent;
import top.zhy.springcloud.service.order.entity.Order;
import top.zhy.springcloud.service.order.service.OrderService;

import java.util.Date;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/25 14:37
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 下单
     * @return
     */
    @GetMapping("/order")
    public String order() {
        Order order = new Order();
        order.setCommodityName("苹果");
        order.setOrderNum(5);
        order.setOrderTime(new Date());

        orderService.order(order);

        return order.getId();
    }

}
