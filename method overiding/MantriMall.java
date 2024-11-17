package com.xworkz.assign2;

import com.xworkz.assignment.Mall;

public class MantriMall extends Mall {

    public void open() {
        System.out.println("open of MantriMall");
    }

    @Override
    public void close() {
        System.out.println("MantriMall is closed");
    }

    @Override
    public void elevation() {
        System.out.println("MantriMall of lulu mall is high");
    }

    @Override
    public void securuty() {
        System.out.println("security in MantriMall is good");
    }
    public void hype(){
        System.out.println("it has more hype");
    }
}
