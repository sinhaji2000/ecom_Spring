package org.example.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreUserDTO {

    private int id;
    private String email;
    private String username;
    private String password;
    private Name name;
    private Address address;
    private String phone;
    private int __v;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Name {
        private String firstname;
        private String lastname;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private Geolocation geolocation;
        private String city;
        private String street;
        private int number;
        private String zipcode;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Geolocation {
        private String lat;
        private String lon; // ✅ 'lon' not 'long' because 'long' is a reserved keyword in Java
    }
}
