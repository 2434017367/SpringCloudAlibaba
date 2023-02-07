package top.zhy.springcloud.service.order.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/1/31 21:48
 */
@RefreshScope
@Configuration
public class TestConfig {

    @Value("${test.user.name:}")
    private String userName;

    @Value("${common.test:}")
    private String commonTest;

    @PostConstruct
    public void init() {
        System.out.println(userName);
        System.out.println("commonTest = " + commonTest);
    }

    public void setCommonTest(String commonTest) {
        System.out.println("commonTest变化了：" + commonTest);
        this.commonTest = commonTest;
    }
}
