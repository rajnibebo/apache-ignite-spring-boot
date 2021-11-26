package com.rajni.apacheignite.model;

import lombok.Data;

@Data
public class Address {

    private int addressId;
    private String street;
    private String city;
    private String state;
    private String country;
    private AddressType type;

}
