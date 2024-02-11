package com.microservices.outbound;

import com.microservices.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/*url - url of the address service
* value - name of this client
* path - if we want to break up URL, hostname:port (goes in url) and URI (goes in path)*/
@FeignClient(url = "${address.url}", value = "address-feign-client")
public interface AddressClient {

    /*Copy paste the controller method from Address service (w/o impl) with annotations.*/
    @GetMapping("/get")
    Address getAddress();
}
