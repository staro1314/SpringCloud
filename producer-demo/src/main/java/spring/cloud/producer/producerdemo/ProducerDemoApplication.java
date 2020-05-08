package spring.cloud.producer.producerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerDemoApplication.class, args);
    }

}
