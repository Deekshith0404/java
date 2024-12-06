package com.xworks.equalsmethods.example;

import java.util.Objects;

public class Pen {
    private int length;
    private int price;
    private String color;
    private String brand;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "length=" + length +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj instanceof Pen){
                Pen dto=(Pen) obj;
                if (brand.equals(dto.getBrand())){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, price, color, brand);
    }
}
