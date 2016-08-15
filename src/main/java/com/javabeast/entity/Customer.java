package com.javabeast.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

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

    @NotNull
    @Min(3)
    @Max(255)
    private String firstName;

    @NotNull
    @Min(3)
    @Max(255)
    private String lastName;
}
