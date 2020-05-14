package spring.cloud.consul.producer.consulproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Staro
 * @date: 2020/5/14 9:55
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello consul:8501 !!!";
    }
}
