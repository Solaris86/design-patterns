package com.udemy.designpatterns.creational.builder2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String name;
    private String age;
    private String address;

    @Override
    public String toString() {
        return "name= " + name + "\nage= " + age + "\naddress=" + address;
    }

    public static UserDTOBuilder userDTOBuilder() {
        return new UserDTOBuilder();
    }

    public static class UserDTOBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String address;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthday(LocalDate birthday) {
            Period ageInYears = Period.between(birthday, LocalDate.now());
            this.age = Integer.toString(ageInYears.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n"
                    + address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAge(age);
            userDTO.setAddress(address);

            return userDTO;
        }

    }
}
