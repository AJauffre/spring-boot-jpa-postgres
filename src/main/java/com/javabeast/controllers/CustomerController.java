package com.javabeast.controllers;

import com.javabeast.dao.CustomerRepository;
import com.javabeast.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
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
    public HttpEntity<List<Customer>> list() {
        return ResponseEntity.ok(customerRepository.findAll());
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public HttpEntity<Customer> saveOrUpdate(@RequestBody @Valid final Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }
}
