package com.xworkz.abst;

public abstract class Army {

    int size;
    Army(int size){
        this.size=size;
    }
    public void protectBorder(){
        System.out.println("protecting border of army base");
    }
    public abstract void useDrone();

    public int getSize() {
        return size;
    }
}
