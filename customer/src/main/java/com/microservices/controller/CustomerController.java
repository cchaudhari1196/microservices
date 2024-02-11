package com.microservices.controller;


import com.microservices.model.Address;
import com.microservices.model.Customer;
import com.microservices.outbound.AddressClient;
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
    AddressClient addressClient;
    
    @GetMapping("/get")
    public Customer getCustomer(){
        var customer = new Customer("Chirag");
        customer.setAddress(addressClient.getAddress());
        return customer;
    }
}
