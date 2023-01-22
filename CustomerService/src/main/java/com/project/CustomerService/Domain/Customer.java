package com.project.CustomerService.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private String customerNumber;
    private String name;
    private Address address;
    private Contact contact;

}
