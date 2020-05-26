package spring.cloud.producer.producerdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Staro
 * @date: 2020/5/5 16:35
 * @Description:
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",this is producer send first messge";
    }
}
