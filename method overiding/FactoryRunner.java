package com.xworkz.TheRunner;

import com.xworkz.assign2.HondaFactory;
import com.xworkz.assign2.HyundaiFactory;
import com.xworkz.assign2.TataFactory;
import com.xworkz.assign2.TvsFactory;
import com.xworkz.assignment.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        TataFactory tataFactory=new TataFactory();
        Factory factory=new TataFactory();
        factory.dispose();
        factory.manufacture();
        factory.run();
        factory.power();
        factory.start();
        tataFactory.sales();
        System.out.println("================================");
        Factory factory1=new HondaFactory();
        HondaFactory hondaFactory=new HondaFactory();
        factory1.dispose();
        factory1.manufacture();
        factory1.run();
        factory1.power();
        factory1.start();
        hondaFactory.value();
        System.out.println("=======================================");
        Factory factory2=new HyundaiFactory();
        HyundaiFactory hyundaiFactory=new HyundaiFactory();
        factory2.dispose();
        factory2.manufacture();
        factory2.run();
        factory2.power();
        factory2.start();
        System.out.println("===========================================");
        Factory factory3=new TvsFactory();
        TvsFactory tvsFactory=new TvsFactory();
        factory3.dispose();
        factory3.manufacture();
        factory3.run();
        factory3.power();
        factory3.start();
        tvsFactory.durabel();

    }
}
