package spring.cloud.config.springconfigclientup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringConfigClientUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientUpApplication.class, args);
    }

}
