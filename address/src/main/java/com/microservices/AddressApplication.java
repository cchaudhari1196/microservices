package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
/*Each MS register itself (with app name - spring.application.name) to eureka server.

	Eureka version 4.0.0 onwards, which is being used in Spring Cloud 2022.0.0,
	you do not need to explicitly register using the annotation @EnableEurekaClient.
	It automatically gets registered as client if spring-cloud-starter-netflix-eureka-client is on the class path.
 */
//@EnableEurekaClient
public class AddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressApplication.class, args);
	}

}
