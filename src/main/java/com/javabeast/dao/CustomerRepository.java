package com.javabeast.dao;

import com.javabeast.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by jeffreya on 15/08/2016.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(final String lastName);

}
