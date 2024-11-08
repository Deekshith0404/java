package com.xworkz.abst;

public class WhiteArmy extends RedArmy{
    public WhiteArmy(int size){
        super(size);
    }
    @Override
    public void useBramose() {
        System.out.println("using bramose in whiteamry");
    }

    @Override
    public void useDrone() {
        System.out.println("using drone in whitearmy");
    }



}
