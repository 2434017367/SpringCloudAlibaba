package top.zhy.springcloud.service.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhy.springcloud.service.order.config.Test1Config;

import java.util.Date;

/**
 * @author zhy
 * @email 2434017367@qq.com
 * @date 2023/2/1 14:43
 */
@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private Test1Config test1Config;

    @GetMapping("/show")
    public String show() {
        String name = test1Config.getName();
        Integer age = test1Config.getAge();
        String s = "name:" + name + " age:" + age;
        System.out.println(s);
        return s;
    }

    /**
     * 获取时间
     * @return
     */
    @GetMapping("/getDate")
    public Date getDate() {
        return new Date();
    }

    @GetMapping("/header")
    public String header(@RequestHeader("zdy") String zdy) {
        return zdy;
    }

}
