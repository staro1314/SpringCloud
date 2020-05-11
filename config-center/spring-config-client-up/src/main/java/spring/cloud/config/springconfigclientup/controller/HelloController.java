package spring.cloud.config.springconfigclientup.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Staro
 * @date: 2020/5/8 18:16
 * @Description:
 */
@RestController
//@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String from() {
        return this.hello;
    }
}
