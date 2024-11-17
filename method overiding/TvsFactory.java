package com.xworkz.assign2;

import com.xworkz.assignment.Factory;

public class TvsFactory extends Factory {
    public void manufacture() {
        System.out.println("TvsFactory manufactorers ");
    }

    @Override
    public void dispose() {
        System.out.println("dispose of Tvs factory");
    }

    @Override
    public void power() {
        System.out.println("power of TvsFactory company");
    }

    @Override
    public void start() {
        System.out.println("start of TvsFactory works");
    }

    @Override
    public void run() {
        System.out.println("running of TvsFactory factory");
    }
    public void durabel(){
        System.out.println("tvs has high durability");
    }
}
