package com.microservices.outbound;


import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

/*Creating Load balancer Client for Address microservice.
name should be same as registered with Eureka server.*/
@LoadBalancerClient(value = "address-ms")
public class AddressLoadBalancerCLient {

    /*At time of startup of Customer service,
    We are telling feign builder to load balance the request to address-ms (mentioned at class level annotation).*/
    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}
