package com.xworkz.newAssign.one;

public class Cracker {

    private String name;
    private int cost;

    public Cracker(String name,int cost){
        this.cost=cost;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj instanceof Cracker){
            Cracker cra=(Cracker) obj;
            if (this.name.equals(cra.name)&&this.cost==cra.cost){
                System.out.println("both are same u can compare");
                return true;
            }
            else {
                System.out.println("not same");
                return false;
            }
        }
        return false;
    }
}
