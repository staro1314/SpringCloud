package spring.cloud.consumer.consumerdemo.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Staro
 * @date: 2020/5/6 14:06
 * @Description:
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam String name) {
        return "hello " +name+", this messge send failed ";
    }
}
