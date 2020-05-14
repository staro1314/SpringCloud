package spring.cloud.consul.consumer.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.consul.consumer.consumer.remote.ServiceProviderRemote;

/**
 * @author: Staro
 * @date: 2020/5/14 10:35
 * @Description:
 */
@RestController
public class ServiceController {
    private final LoadBalancerClient loadBalancerClient;
    private final DiscoveryClient discoveryClient;

    private final ServiceProviderRemote serviceProviderRemote;

    @Autowired
    public ServiceController(DiscoveryClient discoveryClient, LoadBalancerClient loadBalancerClient, ServiceProviderRemote serviceProviderRemote) {
        this.discoveryClient = discoveryClient;
        this.loadBalancerClient = loadBalancerClient;
        this.serviceProviderRemote = serviceProviderRemote;
    }

    @RequestMapping("services")
    public Object services(){
        return discoveryClient.getInstances("service-producer");
    }

    @RequestMapping("discover")
    public Object discover(){
        return loadBalancerClient.choose("service-producer").getUri().toString();
    }

    @RequestMapping("hello")
    public String hello(){
        return serviceProviderRemote.hello();
    }

}
