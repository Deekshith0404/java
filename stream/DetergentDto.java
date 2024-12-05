package com.xworks.collection.dto;

import com.xworks.collection.Runner.detergentRunner;

import java.io.Serializable;

public class DetergentDto implements Comparable<DetergentDto>, Serializable {

    private int pricePerKg;
    private String brand;
    private int quantity;
    private int discount;
    private String soldBy;


    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
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

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    @Override
    public String toString() {
        return "DetergentDto{" +
                "pricePerKg=" + pricePerKg +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", soldBy='" + soldBy + '\'' +
                '}';
    }

    public DetergentDto(int pricePerKg, String brand, int quantity, int discount, String soldBy) {
        this.pricePerKg = pricePerKg;
        this.brand = brand;
        this.quantity = quantity;
        this.discount = discount;
        this.soldBy = soldBy;
    }

    public DetergentDto() {
        System.out.println("no arguments construct");
    }

    @Override
    public int compareTo(DetergentDto dto) {

        return Integer.compare(this.pricePerKg, dto.pricePerKg);
    }
}
