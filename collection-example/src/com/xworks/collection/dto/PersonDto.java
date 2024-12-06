package com.xworks.collection.dto;

public class PersonDto {
    private String name;
    private  String email;
    private  long mobile;
    private String address;
    AddressDto addressDto;

    public PersonDto(){

    }
    public PersonDto(String name, String email, long mobile, String address, AddressDto addressDto) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.addressDto = addressDto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public void setAddressDto(AddressDto addressDto) {
        this.addressDto = addressDto;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                ", addressDto=" + addressDto +
                '}';
    }
}
