package top.zhy.springcloud.service.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zhy.springcloud.service.order.entity.Order;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:17
 */
@Mapper
@Repository
public interface OrderDao extends BaseMapper<Order> {
}
