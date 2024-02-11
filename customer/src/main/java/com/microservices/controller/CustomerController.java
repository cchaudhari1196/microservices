package com.microservices.controller;


import com.microservices.model.Address;
import com.microservices.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${address.url}")
    private String addressUrl;
    
    @GetMapping
    public Customer getCustomer(){
        var customer = new Customer("Chirag");
        customer.setAddress(restTemplate.getForEntity(addressUrl, Address.class).getBody());
        return customer;
    }
}
