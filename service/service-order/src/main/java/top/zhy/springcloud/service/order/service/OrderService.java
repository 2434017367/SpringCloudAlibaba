package top.zhy.springcloud.service.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.zhy.springcloud.service.order.entity.Order;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:18
 */
public interface OrderService extends IService<Order> {

    void order(Order order);

}
