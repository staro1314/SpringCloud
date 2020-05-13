package spring.cloud.zipkin.trackzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import spring.cloud.zipkin.trackzipkin.config.MyTagsProvider;
import zipkin2.server.internal.EnableZipkinServer;

@EnableDiscoveryClient //启用客户端发现
@EnableZipkinServer    //启用调用链服务
@SpringBootApplication
public class TrackZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackZipkinApplication.class, args);
    }

    @Bean
    public MyTagsProvider myTagsProvider(){
        return new MyTagsProvider();
    }
}
