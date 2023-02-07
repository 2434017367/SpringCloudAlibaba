package top.zhy.springcloud.service.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/25 14:50
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/stock")
    public String stock(@RequestParam Integer number) {
        System.out.println("减去库存数" + number + " port:" + port);

        return "减去库存数" + number + " port:" + port;
    }

}
