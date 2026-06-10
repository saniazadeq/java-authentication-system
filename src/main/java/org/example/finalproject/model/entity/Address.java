package org.example.finalproject.model.entity;

public class Address {
    String country;
    String city;
    String address;
    Long id;

    public Address(String country, String city, String address) {
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
