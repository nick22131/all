package ecommerce.springBoot_ecommerceDemo.entity;

import jakarta.persistence.Embeddable;


@Embeddable  // Marks this as a reusable component that can be embedded in other entities
public class Address {
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    // Constructors
    public Address() {
    }  // Required by JPA

    public Address(String street, String city, String state, String country, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }
}

