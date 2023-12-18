package com.mobi.controller;

import com.mobi.model.Customer;
import com.mobi.model.Orders;
import com.mobi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    /*@PostMapping("/insertCustomer")
    public void customer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
    }*/

    @PostMapping("/placeOrder")
    public Customer order(@RequestBody Customer customer) {

//        if(customer.getOrdersList() == null){
//            customer.setOrdersList(new ArrayList<>());
//        }
        for(Orders order : customer.getOrdersList()) {
            order.setCustomer(customer);
        }
        return customerService.insertCustomer(customer);
    }
}

