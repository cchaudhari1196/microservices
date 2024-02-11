package com.microservices.contoller;


import com.microservices.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/get")
    public Address getAddress(){
        return new Address(1, "Pune", "Itrends", "maharashtra");
    }
}
