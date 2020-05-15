package spring.cloud.producer.gatewayproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewayProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayProducerApplication.class, args);
    }

}
