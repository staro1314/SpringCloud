package spring.cloud.gateway.eureka.gatewayeureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Staro
 * @date: 2020/5/18 10:58
 * @Description:
 */
@RestController
public class FallBackController {

    @RequestMapping("/fallback")
    public String fallback(){
        return "The server is busy, please request later!";
    }
}
