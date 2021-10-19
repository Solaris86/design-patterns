package com.udemy.designpatterns.creational.builder2;

import com.udemy.designpatterns.creational.builder2.Address;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

}
