package com.xworkz.assign2;

import com.xworkz.assignment.Factory;

public class HondaFactory extends Factory {
    public void manufacture() {
        System.out.println("HondaFactory manufactorers ");
    }

    @Override
    public void dispose() {
        System.out.println("dispose of HondaFactory");
    }

    @Override
    public void power() {
        System.out.println("power of HondaFactory company");
    }

    @Override
    public void start() {
        System.out.println("start of HondaFactory works");
    }

    @Override
    public void run() {
        System.out.println("running of HondaFactory");
    }
    public void value(){
        System.out.println("it holds high value");
    }
}
