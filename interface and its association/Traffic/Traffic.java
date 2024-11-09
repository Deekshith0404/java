package com.xworkz.Abstraction.Traffic;

public class Traffic {
    TrafficRule trafficRule;
    Traffic(TrafficRule trafficRule){
        this.trafficRule=trafficRule;
    }

    void speedcheck() {
        int speed = trafficRule.drivingSpeed();

        if (speed > 30 && speed < 60) System.out.println("under speed limit");
        else if (speed > 60) System.out.println("above speed limit");
    }
    void helmetCheck() {
        boolean helmet = trafficRule.wearingHealmet();

        if (helmet) System.out.println("he is wearing healmet");
        else System.out.println("not wear");
    }
    void modifyCheck(){

        String modify=trafficRule.modification();

        if (modify=="yes") System.out.println("the vehical is modified");
            else if(modify=="no") System.out.println("the vehical is not modified ");
    }
}
