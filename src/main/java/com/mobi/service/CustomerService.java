package com.mobi.service;

import com.mobi.model.Customer;
import com.mobi.model.Orders;
import com.mobi.reposotory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);

    }
}
