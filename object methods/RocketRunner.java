package com.xworkz.newAssign.RunnerOfAssign;

import com.xworkz.newAssign.one.Rocket;

public class RocketRunner {
    public static void main(String[] args) {
        Rocket ro1=new Rocket("spaceX",1000000,"Elon");
        Rocket ro2=new Rocket("spaceX",1000000,"Elon");

        boolean check=ro1.equals(ro2);
        System.out.println("the result is "+check);
    }
}
