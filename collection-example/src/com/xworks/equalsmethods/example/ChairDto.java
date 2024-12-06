package com.xworks.equalsmethods.example;

import java.util.Objects;

public class ChairDto {
    private int price;
    private String brand;
    private int quantity;
    private int capaOfPeople;

    public ChairDto(int price, String brand, int quantity, int capaOfPeople) {
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.capaOfPeople = capaOfPeople;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCapaOfPeople() {
        return capaOfPeople;
    }

    public void setCapaOfPeople(int capaOfPeople) {
        this.capaOfPeople = capaOfPeople;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", capaOfPeople=" + capaOfPeople +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(price, brand, quantity, capaOfPeople);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof BagDto){
                ChairDto dto=( ChairDto) obj;
//                if (){
//                    return true;
//                }
            }
        }
        return false;
    }
}
