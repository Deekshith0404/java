package com.xworkz.abst;

public  class LeelaHotel extends Hotel{
    @Override
    public void service() {
        System.out.println("service by leela hotel");
    }

    @Override
    public void advanceBooking() {
        System.out.println("advance booking by leela hotel");
    }

    @Override
    public void portableRoom() {
        System.out.println("portable room avilable in leela hotel");
    }


}
