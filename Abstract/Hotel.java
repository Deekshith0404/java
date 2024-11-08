package com.xworkz.abst;

public abstract class Hotel {
    public void service(){
        System.out.println("service provided");
    }
    public void advanceBooking(){
        System.out.println("advance booking done in hotel");
    }
    public abstract void portableRoom();

    @Override
    public String toString() {
        return "service and advance booking";
    }
}
