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

    @Bean
    public KeyResolver userKeyResolver(){
        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getQueryParams().getFirst("user")));
    }

//    @Bean
//    public KeyResolver ipKeyResolver() {
//        return exchange -> Mono.just(Objects.requireNonNull(exchange.getRequest().getRemoteAddress()).getHostName());
//    }
}
