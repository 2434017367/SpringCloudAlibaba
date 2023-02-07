package top.zhy.springcloud.service.stock.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.zhy.springcloud.service.stock.dao.StockDao;
import top.zhy.springcloud.service.stock.entity.Stock;
import top.zhy.springcloud.service.stock.service.StockService;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:59
 */
@Service("stockService")
public class StockServiceImpl extends ServiceImpl<StockDao, Stock> implements StockService {

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String stock(Stock stock) {
        this.save(stock);

        return stock.getId();
    }

}
