package spring.cloud.gateway.eureka.gatewayeureka.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * @author: Staro
 * @date: 2020/5/18 10:26
 * @Description:
 */
@Component
public class Config {

    /**
     * 根据请求参数中的 user 字段来限流
     * @return
     */
    @Bean
    public KeyResolver userKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getQueryParams().getFirst("user")));
    }

    /**
     * 根据请求 IP 地址来限流
     * @return
     */
//    @Bean
//    public KeyResolver ipKeyResolver() {
//        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getHostName());
//    }
}
