package top.zhy.springcloud.service.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhy.springcloud.api.stock.feign.StockFeignCilent;
import top.zhy.springcloud.service.order.dao.OrderDao;
import top.zhy.springcloud.service.order.entity.Order;
import top.zhy.springcloud.service.order.service.OrderService;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:19
 */
@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

    @Autowired
    private StockFeignCilent stockFeignCilent;

    @GlobalTransactional(rollbackFor = Exception.class)
    @Override
    public void order(Order order) {
        this.save(order);

        stockFeignCilent.stock(order.getId(), order.getOrderNum());
    }

}
