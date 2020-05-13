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
        log.info("request two name is "+name);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            log.error("Hello two error",e);
        }
        return "hello "+name+",this is producer 2 send first messge";
    }
}
