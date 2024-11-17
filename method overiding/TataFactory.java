package com.xworkz.assign2;

import com.xworkz.assignment.Factory;

public class TataFactory extends Factory {
    @Override
    public void manufacture() {
        System.out.println("tata manufactorers ");
    }

    @Override
    public void dispose() {
        System.out.println("dispose of tata factory");
    }

    @Override
    public void power() {
        System.out.println("power of tata company");
    }

    @Override
    public void start() {
        System.out.println("start of tata works");
    }

    @Override
    public void run() {
        System.out.println("running of tata factory");
    }
    public void sales(){
        System.out.println("the sale are good of tata");
    }
}
