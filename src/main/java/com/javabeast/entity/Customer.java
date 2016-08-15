package com.javabeast.entity;

import lombok.*;

import javax.persistence.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
}
