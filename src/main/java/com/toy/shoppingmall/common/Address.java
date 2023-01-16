package com.toy.shoppingmall.common;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String city;
    private String street;
    private String apt;

    public Address(String city, String street, String apt) {
        this.city = city;
        this.street = street;
        this.apt = apt;
    }

}
