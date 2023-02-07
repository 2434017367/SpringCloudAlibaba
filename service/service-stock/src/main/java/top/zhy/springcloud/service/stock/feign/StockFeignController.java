package top.zhy.springcloud.service.stock.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import top.zhy.springcloud.api.stock.feign.StockFeignCilent;
import top.zhy.springcloud.service.stock.entity.Stock;
import top.zhy.springcloud.service.stock.service.StockService;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/30 17:53
 */
@RestController
public class StockFeignController implements StockFeignCilent {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StockService stockService;

    @Override
    public String stock(String orderId, Integer number) {
        System.out.println("port:" + port);

        String msg = "orderId:" + orderId + ", number:" + number;
        System.out.println(msg);

        Stock stock = new Stock();
        stock.setOrderId(orderId);
        stock.setStockNum(number);

        String stockId = stockService.stock(stock);

        return stockId;
    }

}
