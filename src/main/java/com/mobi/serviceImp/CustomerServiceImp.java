package com.mobi.serviceImp;

import com.mobi.model.Customer;
import com.mobi.reposotory.CustomerRepository;
import com.mobi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer insertCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void getCustomer(Customer customer) {

    }
}