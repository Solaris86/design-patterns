package com.udemy.designpatterns.creational.builder1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;

    @Override
    public String toString() {
        return "name= " + name + "\nage= " + age + "\naddress=" + address;
    }

}
