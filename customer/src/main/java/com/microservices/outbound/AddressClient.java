package com.microservices.outbound;

import com.microservices.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*url - url of the address service
* value - name of this client
* path - if we want to break up URL, hostname:port (goes in url) and URI (goes in path)
*
* How to use Eureka with Feign Client.
* 1. we dont need url. i.e. hostname. but, need path i.e. URI.
* 2. We just need to pass name of the service that we want to send request to.
* (should be same name which registered with Eureka server)
* */
@FeignClient(value = "address-ms", path="/address")
public interface AddressClient {

    /*Copy paste the controller method from Address service (w/o impl) with annotations.*/
    @GetMapping("/get")
    Address getAddress();
}
