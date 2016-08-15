package com.javabeast.dao;

import com.javabeast.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jeffreya on 15/08/2016.
 */
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    default List<Customer> findByLastName(final String lastName) {
        return new ArrayList<>();
    }

}
