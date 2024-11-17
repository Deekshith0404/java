package com.xworkz.assign2;

public class lavanya {
    public void playing(Cricket cricket){
        System.out.println(" lavanya playing cricket");
        cricket.salary();

        if (cricket instanceof IplCricket){
            IplCricket ipl=(IplCricket) cricket;
            ipl.bidding();
        }


    }


}
