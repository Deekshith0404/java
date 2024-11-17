package com.xworkz.assign2;

import com.xworkz.assignment.Mall;

public class LuluMall extends Mall {
    @Override
    public void open() {
        System.out.println("open of lulumall");
    }

    @Override
    public void close() {
        System.out.println("lulu mall is closed");
    }

    @Override
    public void elevation() {
        System.out.println("elevation of lulu mall is high");
    }

    @Override
    public void securuty() {
        System.out.println("security in lulu mall is good");
    }
    public  void place(){
        System.out.println("lulu mall has been in a popular place");
    }
}
