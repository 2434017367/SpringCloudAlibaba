package top.zhy.springcloud.service.order.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/1 14:36
 */
@RefreshScope
@Component
@ConfigurationProperties(prefix = "test.user")
public class Test1Config {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("user.name修改了：" + name);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
