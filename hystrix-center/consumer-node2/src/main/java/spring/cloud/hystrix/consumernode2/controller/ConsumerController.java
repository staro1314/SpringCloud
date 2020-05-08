package spring.cloud.hystrix.consumernode2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.hystrix.consumernode2.remote.HelloRemote;

/**
 * @author: Staro
 * @date: 2020/5/5 17:25
 * @Description:
 */
@RestController
public class ConsumerController {
    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable String name) {
        return helloRemote.hello2(name);
    }
}
