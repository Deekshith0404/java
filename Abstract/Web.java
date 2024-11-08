package com.xworkz.abst;

public abstract class Web {
    int using;

    public void version(int using){
        this.using=using;

    }
    public abstract void autoconnect();

    @Override
    public String toString() {
        return "Web{" +
                " version using :" + using +
                '}';
    }
}
