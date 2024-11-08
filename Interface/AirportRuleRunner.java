package com.xworkz.implRunner;

import com.xworkz.Impl.AirportRuleImpl;

public class AirportRuleRunner {
    public static void main(String[] args) {
        AirportRuleImpl air=new AirportRuleImpl();
        boolean time=air.arriveBefore();
        String id=air.idProof();
        System.out.println("did the plain arive before time :"+time);
        System.out.println("the id proof provided is :"+id);
    }
}
