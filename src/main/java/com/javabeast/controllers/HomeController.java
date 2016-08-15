package com.javabeast.controllers;

import com.javabeast.dao.CustomerRepository;
import com.javabeast.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jeffreya on 14/08/2016.
 */

@RestController
@RequestMapping("/")
public class HomeController {


    private final CustomerRepository customerRepository;

    @Autowired
    public HomeController(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index() {

        customerRepository.save(Customer.builder().firstName("Andrew").lastName("Jeffrey").build());
        return "Greetings from Spring Boot!";
    }
}
