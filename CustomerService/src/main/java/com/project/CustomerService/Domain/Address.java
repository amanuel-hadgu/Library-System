package com.project.CustomerService.Domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String city;
    private String zip;
    private String street;
}
