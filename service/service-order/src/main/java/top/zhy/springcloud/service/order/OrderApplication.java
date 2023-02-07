package top.zhy.springcloud.service.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/25 14:48
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"top.zhy.springcloud.api.**.feign"})
public class OrderApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(OrderApplication.class, args);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String userName = environment.getProperty("test.user.name");
        String userAge = environment.getProperty("test.user.age");

        System.out.println("userName:" + userName + ", userAge:" + userAge);
    }

    // 使用feign代替restTemplate
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//        return restTemplateBuilder.build();
//    }
//
//    /**
//     * ribbon负载均衡策略配置，全局配置
//     * @return
//     */
//    @Bean
//    public IRule iRule() {
//        return new NacosRule();
//    }

}
