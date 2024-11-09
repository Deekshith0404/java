package com.xworkz.Abstraction.Traffic;

public class TrafficRunner {
    public static void main(String[] args) {
        TrafficRule traffic=new TrafficRuleImpl();
        Traffic tra=new Traffic(traffic);
        tra.helmetCheck();
        tra.modifyCheck();
        tra.speedcheck();

    }
}
