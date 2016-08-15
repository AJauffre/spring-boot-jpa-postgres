package com.javabeast.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by jeffreya on 15/08/2016.
 */

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
}
