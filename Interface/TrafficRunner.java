package com.xworkz.implRunner;

import com.xworkz.Impl.TrafficPoliceImpl;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficPoliceImpl tra=new TrafficPoliceImpl();
        int speed =tra.speedLimit();
        boolean helmet=tra.wearingHelmet();

        System.out.println("the speed is "+speed);
        System.out.println("is he wearing helmet? "+helmet);
    }
}
