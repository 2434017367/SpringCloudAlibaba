package top.zhy.springcloud.service.stock.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.zhy.springcloud.service.stock.entity.Stock;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/3 15:59
 */
public interface StockService extends IService<Stock> {

    String stock(Stock stock);

}
