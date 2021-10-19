package com.udemy.designpatterns.creational.builder1;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserDTO userDTO;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate birthday) {
        Period ageInYears = Period.between(birthday, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n"
                + address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        userDTO = new UserWebDTO(firstName + " " + lastName, address, age);
        return userDTO;
    }

    @Override
    public UserDTO getUserDto() {
        return userDTO;
    }
}
