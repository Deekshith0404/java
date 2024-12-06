package com.xworks.equalsmethods.example;

import java.util.Objects;

public class BagDto {
    private String brand;
    private int capacityInKg;
    private String lengthInFeet;
    private int price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacityInKg() {
        return capacityInKg;
    }

    public void setCapacityInKg(int capacityInKg) {
        this.capacityInKg = capacityInKg;
    }

    public String getLengthInFeet() {
        return lengthInFeet;
    }

    public void setLengthInFeet(String lengthInFeet) {
        this.lengthInFeet = lengthInFeet;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BagDto{" +
                "brand='" + brand + '\'' +
                ", capacityInKg=" + capacityInKg +
                ", lengthInFeet='" + lengthInFeet + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof BagDto){
                BagDto dto=(BagDto) obj;
                if (lengthInFeet.equals(dto.lengthInFeet)){
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(brand, capacityInKg, lengthInFeet, price);
    }
}
