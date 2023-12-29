package com.mobi.controller;

import com.mobi.model.Customer;
import com.mobi.model.Orders;
import com.mobi.serviceImp.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

    @Autowired
    CustomerServiceImp customerServiceImp;

    /*@PostMapping("/insertCustomer")
    public void customer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
    }*/

//    @PostMapping("/placeOrder")
//    public Customer order(@RequestBody Customer customer) {
//
////        if(customer.getOrdersList() == null){
////            customer.setOrdersList(new ArrayList<>());
////        }
//        for(Orders order : customer.getOrdersList()) {
//            order.setCustomer(customer);
//        }
//        return customerService.insertCustomer(customer);
//    }

    @PostMapping("/placeOrder")
    public ResponseEntity<Customer> order(@RequestBody Customer customer) {

//        if(customer.getOrdersList() == null){
//            customer.setOrdersList(new ArrayList<>());
//        }
        for(Orders order : customer.getOrdersList()) {
            order.setCustomer(customer);
        }
        return ResponseEntity.status(HttpStatus.OK).body(customerServiceImp.insertCustomer(customer));
                //return customerService.insertCustomer(customer);
    }

    @GetMapping("/customer/{cid}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long productId)
    {
      //  return new ResponseEntity<>(customerServiceImp.getCustomer(customer).get(), HttpStatus.OK);
    return null;
    }
}