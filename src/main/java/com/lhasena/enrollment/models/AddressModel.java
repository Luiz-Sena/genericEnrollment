package com.lhasena.enrollment.models;

public class AddressModel {
    private String street;
    private String state;
    private String postCode;
    private String number;
    private String country;
    private String complement;

    public AddressModel() {
    }

    public AddressModel(String street, String state, String postCode, String number, String country, String complement) {
        this.street = street;
        this.state = state;
        this.postCode = postCode;
        this.number = number;
        this.country = country;
        this.complement = complement;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
