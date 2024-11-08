package com.xworkz.abstRunner;

import com.xworkz.abst.WhiteArmy;

public class ArmyRunner {
    public static void main(String[] args) {
        WhiteArmy whiteArmy=new WhiteArmy(60);
        whiteArmy.useBramose();
        whiteArmy.useDrone();
        whiteArmy.protectBorder();
        System.out.println("size of the red army :"+whiteArmy.getSize());
    }
}
