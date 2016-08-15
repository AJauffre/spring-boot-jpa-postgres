package com.javabeast.controllers;

import com.javabeast.dao.CustomerRepository;
import com.javabeast.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jeffreya on 14/08/2016.
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {


    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerController(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Customer> list() {
        return customerRepository.findAll();
    }
}
