package com.rajni.apacheignite.model;

import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private String customerName;
    private String email;
    private int age;
    private Gender gender;
    private Address address;
}
