package com.xworks.collection.dto;

public class AddressDto {
    private String street;
    private int streetNumber;
    private String area;

     public AddressDto(){

    }

    public AddressDto(String street, int streetNumber, String area) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "addressDto{" +
                "street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", area='" + area + '\'' +
                '}';
    }
}
