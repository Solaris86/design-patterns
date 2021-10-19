package com.udemy.designpatterns.creational.builder2;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String zipCode;
    private String state;

}
