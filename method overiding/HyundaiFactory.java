package com.xworkz.assign2;

import com.xworkz.assignment.Factory;

public class HyundaiFactory extends Factory {
    public void manufacture() {
        System.out.println("HyundaiFactory manufactorers ");
    }

    @Override
    public void dispose() {
        System.out.println("dispose of HyundaiFactory");
    }

    @Override
    public void power() {
        System.out.println("power of HyundaiFactory company");
    }

    @Override
    public void start() {
        System.out.println("start of HyundaiFactory works");
    }

    @Override
    public void run() {
        System.out.println("running of HyundaiFactory");
    }
    public void location(){
        System.out.println("it is located in a good place");
    }
}
