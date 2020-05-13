package spring.cloud.zuul.gatewayzuuleureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy /**支持网关路由:启用Zipkin服务。**/
@SpringBootApplication
public class GatewayZuulEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulEurekaApplication.class, args);
    }

}
