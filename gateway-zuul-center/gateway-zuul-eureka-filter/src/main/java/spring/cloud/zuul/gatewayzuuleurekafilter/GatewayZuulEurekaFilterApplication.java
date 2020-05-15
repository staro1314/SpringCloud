package spring.cloud.zuul.gatewayzuuleurekafilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import spring.cloud.zuul.gatewayzuuleurekafilter.filter.TokenFilter;

@EnableZuulProxy //启用Zipkin服务。
@SpringBootApplication
public class GatewayZuulEurekaFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulEurekaFilterApplication.class, args);
    }

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

}
