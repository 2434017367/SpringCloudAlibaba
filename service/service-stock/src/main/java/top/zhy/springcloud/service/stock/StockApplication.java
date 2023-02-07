package top.zhy.springcloud.service.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/25 14:50
 */
@SpringBootApplication
public class StockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(StockApplication.class, args);
    }

}
