package com.xworkz.assign2;

import com.xworkz.assignment.Mall;

public class OrionMall extends Mall {
    @Override
    public void open() {
        System.out.println("open access in orion mall");
    }

    @Override
    public void close() {
        System.out.println("close of orien mall");
    }

    @Override
    public void elevation() {
        System.out.println("elevation in orien mall");
    }

    @Override
    public void securuty() {
        System.out.println("security of orien mall");
    }
    public void populat(){
        System.out.println("its very popular");
    }
}
