package spring.cloud.producer.gatewayproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Staro
 * @date: 2020/5/5 16:35
 * @Description:
 */

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello gateway,this is producer2";
    }

    @RequestMapping("foo")
    public String foo(String foo){
        return "hello "+foo+"2!";
    }

    @RequestMapping("retry")
    public String retry() throws InterruptedException {
        System.out.println("producer2 retry");
        Thread.sleep(10000);
        return "producer2 retry";
    }
}
