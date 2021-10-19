package com.udemy.designpatterns.creational.builder1;

import java.time.LocalDate;

public interface UserDTOBuilder {

    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate localDate);
    UserDTOBuilder withAddress(Address address);

    UserDTO build();
    UserDTO getUserDto();

}
