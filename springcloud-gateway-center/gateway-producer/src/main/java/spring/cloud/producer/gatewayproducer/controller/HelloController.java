package spring.cloud.producer.gatewayproducer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author: Staro
 * @date: 2020/5/5 16:35
 * @Description:
 */

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello gateway,this is producer1";
    }

    @RequestMapping("foo")
    public String foo(String foo){
        return "hello "+foo+"1!";
    }

    @RequestMapping("retry")
    public String retry() throws IOException {
        System.out.println("producer1 retry");
        int i=1/0;
//        Thread.sleep(100000);
        return "producer1 retry";
    }

}
