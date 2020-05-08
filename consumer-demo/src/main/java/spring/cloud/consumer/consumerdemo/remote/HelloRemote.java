package spring.cloud.consumer.consumerdemo.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: Staro
 * @date: 2020/5/5 17:23
 * @Description:
 */
//1.远程服务名，及spring.application.name配置的名称。
// 2.在HelloRemote类添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
@FeignClient(name = "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name);//此类中的方法和远程服务中contoller中的方法名和参数需保持一致
}
