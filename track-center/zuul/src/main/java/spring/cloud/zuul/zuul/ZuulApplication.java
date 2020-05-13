package spring.cloud.zuul.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import spring.cloud.zuul.zuul.filter.TokenFilter;

@EnableZuulProxy //启用Zipkin服务。
@SpringBootApplication
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
