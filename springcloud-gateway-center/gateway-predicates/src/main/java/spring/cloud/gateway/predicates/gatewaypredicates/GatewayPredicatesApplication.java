package spring.cloud.gateway.predicates.gatewaypredicates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayPredicatesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayPredicatesApplication.class, args);
    }

    //    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("path_route", r -> r.path("/about")
//                        .filters(f->f.stripPrefix(1))
//                        .uri("http://localhost:10001"))
//                .build();
//    }
}
