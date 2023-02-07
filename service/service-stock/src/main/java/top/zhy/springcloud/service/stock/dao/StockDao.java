package top.zhy.springcloud.service.stock.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.zhy.springcloud.service.stock.entity.Stock;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:58
 */
@Mapper
@Repository
public interface StockDao extends BaseMapper<Stock> {

}
