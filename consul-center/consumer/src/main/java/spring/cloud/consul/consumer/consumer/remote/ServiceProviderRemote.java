package spring.cloud.consul.consumer.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Staro
 * @date: 2020/5/14 10:52
 * @Description:
 */
@FeignClient(name = "service-producer")
public interface ServiceProviderRemote {
    @RequestMapping("hello")
    public String hello();
}
