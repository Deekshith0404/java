package com.xworkz.abst;

public class AshokaHotel extends Hotel{
    @Override
    public void portableRoom() {
        System.out.println("portable room available");

    }

    @Override
    public void service() {
        System.out.println("service by ashoka hotel");
    }

    @Override
    public void advanceBooking() {
        System.out.println("advance booking by ashoka hotel");
    }
}
