package top.zhy.springcloud.api.stock.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.zhy.springcloud.common.core.constant.FeignConstant;
import top.zhy.springcloud.common.core.constant.ServiceModelConstant;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/30 17:26
 */
@FeignClient(value = ServiceModelConstant.STOCK_SERVICE, path = "/stock")
public interface StockFeignCilent {

    @PostMapping(FeignConstant.FEIGN_INSIDE_URL_PREFIX + "/stock")
    String stock(@RequestParam("orderId") String orderId,
                 @RequestParam("number") Integer number);

}
